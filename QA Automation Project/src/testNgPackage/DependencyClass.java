package testNgPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DependencyClass {
	
	WebDriver browserObject;
	
	@Test
	public void OpeningAmazonSite() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
		
		WebDriver browserObject = new ChromeDriver();
		
		browserObject.get("http://www.amazon.com/");
		
		Thread.sleep(2000);
		
		browserObject.close();
	}
	
 @Test(dependsOnMethods = "OpeningAmazonSite")
 public void OpeningCNBCSite() throws InterruptedException {
	 
	 System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
	 
	 WebDriver browserObject =new ChromeDriver();
	 
	 browserObject.get("http://www.cnbc.com/");
	 
	 Thread.sleep(2000);
	 
	 browserObject.close();
 } 
	 
	 @Test(dependsOnMethods = "OpeningCNBCSite")
	 public void OpeningYahooSite() throws InterruptedException {
		 
	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
	
	WebDriver browserObject = new ChromeDriver();
	
	browserObject.get("http://www.yahoo.com/");
	
	Thread.sleep(2000);
	
	browserObject.close();
	
	
	
	
		 
	 
	 
	 
	 
	 
	 
	 
 }
	
}

