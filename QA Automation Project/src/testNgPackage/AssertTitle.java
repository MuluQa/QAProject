package testNgPackage;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AssertTitle {
  
	@Test
	public void checkGoogleSite() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
		
		WebDriver browserObject = new ChromeDriver();
		
		browserObject.get("https://google.com");
		
		String expectedTitle ="Google";
		
		String actualTitle = browserObject.getTitle();
		
		assertEquals(actualTitle,expectedTitle);
	}
	
}
