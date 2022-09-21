package testNgPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PriorityTest {
  WebDriver browserObject;
	@Test(priority = 1)
	public void OpeningAppleWebsite() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
		
		WebDriver browserObject = new ChromeDriver();
		
		browserObject.get("https://www.youtube.com/");
		
		Thread.sleep(3000);
		
		browserObject.close();
	}
	
	@Test(priority = 2)
	public void OpeningYouTube() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
		
		WebDriver browserObject = new ChromeDriver();
		
		browserObject.get("https://www.microsoft.com");
		
		Thread.sleep(3000);
		
		browserObject.close();
	}
	@Test(priority = 3)
	public void OpeningAppleWebpage() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
		
		WebDriver browserObject = new ChromeDriver();
		
		browserObject.get("https://www.apple.com");
		
		Thread.sleep(3000);
		
		browserObject.close();
	
	}
	}

