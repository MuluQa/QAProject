package testNgPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DependencyClass {
  WebDriver browserObject;
  @Test
  public void OpeningYouTube() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
	  
	  WebDriver browserObject = new ChromeDriver();
	  
	  browserObject.get("https://www.youtube.com");
	  
	  Thread.sleep(3000);
	  
	  browserObject.close();
  }
	@Test(dependsOnMethods = "OpeningYouTube")
	public void OpenAppleWebpage() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
		
		WebDriver browserObject = new ChromeDriver();
		
		browserObject.get("http://www.apple.com/");
		
		Thread.sleep(3000);
		
		browserObject.close();
	}
	@Test(dependsOnMethods = "OpenAppleWebpage")
	public void OpenMicrosoftWebPage() throws InterruptedException {
		 
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
		
		WebDriver browserObject = new ChromeDriver();
		
		browserObject.get("http://www.microsoft.com/");
		
		Thread.sleep(3000);
		
		browserObject.close();
		
		
		
	}
}
