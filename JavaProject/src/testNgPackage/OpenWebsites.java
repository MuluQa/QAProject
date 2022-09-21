package testNgPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OpenWebsites {
 WebDriver browserObject;
	@Test
	public void OpeningAppleWebPage() throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
		
		WebDriver browserObject = new ChromeDriver();
		
		browserObject.get("https://www.apple.com/");
		
		Thread.sleep(3000);
		
		browserObject.close();
	}
		@Test
		public void OpeningYouTubeWebpage() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
		
		WebDriver browserObject = new ChromeDriver();
		
		browserObject.get("https://www.youtube.com/");
		
		Thread.sleep(3000);
		
		browserObject.close();
	
		}
		@Test
		public void OpeningMicrosoftWebPage() throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
			
			WebDriver browserObject = new ChromeDriver();
			
			browserObject.get("https://www.microsoft.com");
			
			Thread.sleep(3000);
			
			browserObject.close();
				
			
			
			
		}
		
	

}
