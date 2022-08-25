package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchCode {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
		
		WebDriver browserObject = new ChromeDriver();
		
		browserObject.get("http:/www.google.com/");
		
		browserObject.findElement(By.name("q")).sendKeys("Selenium Python");
		Thread.sleep(6000);
		
		browserObject.findElement(By.name("btnK")).submit();
		
		Thread.sleep(6000);
		
		browserObject.close();
		
		
		
		
	}

}
