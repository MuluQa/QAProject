package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
		
		WebDriver browserObject = new ChromeDriver();
		
		browserObject.get("http://training.qaonlinetraining.com/testPage.php");
		
		WebElement checkboxBoat = browserObject.findElement(By.xpath("/html/body/form/input[9]"));
		
		WebElement checkboxBike = browserObject.findElement(By.xpath("/html/body/form/input[7]"));
		
		//WebElement checkboxCar = browserObject.findElement(By.xpath(null));
		
		WebElement checkboxHorse = browserObject.findElement(By.xpath("/html/body/form/input[10]"));
		
		WebElement submitButton =browserObject.findElement(By.xpath("/html/body/form/input[11]"));
		
		checkboxBoat.click();
		
		checkboxBike.click();
		
		checkboxHorse.click();
		
		System.out.println("wait 3 seconds and submit and close");
		
		submitButton.click();
		
		Thread.sleep(6000);
		
		browserObject.close();
		
	
		
		
		
		
		
	}

}
