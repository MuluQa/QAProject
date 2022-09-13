package testNgPackage_SimilarProgramPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OpenWebsites {
 WebDriver browserObject;
	  @Test
	  public void OpeningMacysSite() throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
		  browserObject = new ChromeDriver();
		  browserObject.get("https://macys.com");
		  Thread.sleep(2000);
		  browserObject.close();
	  }
	  
      @Test
      public void OpeningDillardsSite() throws InterruptedException {
    	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
    	browserObject = new ChromeDriver();
    	browserObject.get("https://dillards.com");
    	Thread.sleep(2000);
    	browserObject.close(); 
  }
      @Test
      public void OpeningWalmartSite() throws InterruptedException {
    	  System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
    	  browserObject = new ChromeDriver();
    	  browserObject.get("https://walmart.com");
    	  Thread.sleep(3000);
    	  browserObject.close();
    	  
    	  
      }
}
