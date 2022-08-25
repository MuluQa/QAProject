package seleniumPackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {

	public static void main(String[] args)throws InterruptedException  {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
		
		ChromeDriver browserObject = new ChromeDriver();
		
		browserObject.get("http://training.qaonlinetraining.com/testPage.php");
		
		browserObject.findElement(By.id("alert")).click();
		
		Alert alert = browserObject.switchTo().alert();
		
		System.out.println(alert.getText());
		
		Thread.sleep(6000);
		
		alert.accept();
		
		browserObject.findElement(By.id("confirm")).click();
		
		Alert alert1 = browserObject.switchTo().alert();
		
		System.out.println(alert1.getText());
		
		Thread.sleep(6000);
		
		alert1.dismiss();
		
		
		browserObject.findElement(By.id("prompt")).click();
		
		Alert alert2 = browserObject.switchTo().alert();
		
		System.out.println(alert2.getText());
		
		Thread.sleep(6000);
		
		alert2.sendKeys("Mrs Mulualem");
		
		alert2.accept();
		
		browserObject.close();
		
		
	}

}
