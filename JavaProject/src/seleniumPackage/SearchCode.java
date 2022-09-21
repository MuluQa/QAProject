package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchCode {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
		
		WebDriver browserObject =new ChromeDriver();
		
		browserObject.get("https://www.google.com");
		
		browserObject.findElement(By.name("q")).sendKeys("Selenium python");
		
		browserObject.findElement(By.name("btnK")).submit();
		
		Thread.sleep(3000);
		
		browserObject.close();
		
		

	}

}
