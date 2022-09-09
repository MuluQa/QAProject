package testNgPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DependencyClassOne {
	
	WebDriver browserObject;
	
  @Test
  public void  OpeningGoogleSite() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
	  
	  WebDriver browserObject = new ChromeDriver();
	  
	  browserObject.get("http://www.google.com/");
	  
	  Thread.sleep(2000);
  
	  browserObject.close();
  }
  
  
  
 @Test(dependsOnMethods = "OpeningGoogleSite")
	  
	public void OpeningCnnSite() throws InterruptedException {
		  
		  System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		  
		  WebDriver browserObject = new ChromeDriver();
		  
		  browserObject.get("http://www.cnn.com/");
  
		  Thread.sleep(2000);
		  
		  browserObject.close();
  }
 
 @Test(dependsOnMethods = "OpeningCnnSite")
 public void OpeningItLearn360Site() throws InterruptedException {
	 
	 System.setProperty("webdrive.chrome.driver","C:\\Program Files\\chromedriver.exe");
	 
	 WebDriver browserObject = new ChromeDriver();
	 
	 browserObject.get("http://www.Itlearn360.com/");
	 
	 Thread.sleep(2000);
	 
	 browserObject.close();
 }
 
  }

