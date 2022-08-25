package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FillForm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver browserObject;
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
		
		browserObject = new ChromeDriver();
		
		browserObject.get("http:\\www.training.qaonlinetraining.com/testPage.php");
		
		browserObject.findElement(By.name("name")).sendKeys("Itlearn360");
		
		browserObject.findElement(By.name("email")).sendKeys("Itlearn360@email.com");
		
		browserObject.findElement(By.name("website")).sendKeys("www.Itlearn360.com");
		
		browserObject.findElement(By.name("comment")).sendKeys("This is the best website ever");
		
		browserObject.findElement(By.name("submit")).click();
		
		browserObject.close();
		
		
		
	        
	}

}
