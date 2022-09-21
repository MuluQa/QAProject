package seleniumPackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
		
		WebDriver browserObject = new ChromeDriver();
		
		browserObject.get("http://training.qaonlinetraining.com/testPage.php");
		
		browserObject.findElement(By.id("alert")).click();
		
		Alert alert = browserObject.switchTo().alert();
		
		System.out.println(alert.getText());
		
		alert.accept();
		
		Thread.sleep(3000);
		
		browserObject.findElement(By.id("confirm")).click();
		
		Alert alert1 = browserObject.switchTo().alert();
		
		System.out.println("alert1.getText()");
		
		alert1.dismiss();
		
		Thread.sleep(3000);
		
		
		browserObject.findElement(By.id("prompt")).click();
		
		Alert alert2= browserObject.switchTo().alert();
		
		System.out.println(alert2.getText());
		
		Thread.sleep(3000);
		
		alert2.sendKeys("Mr.Bond");
		
		Thread.sleep(6000);
		alert2.accept();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
