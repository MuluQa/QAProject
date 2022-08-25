package testNgPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OpenWebsite {
  @Test
  public void OpeningAmazonSite() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
	  
	  WebDriver browserObject = new ChromeDriver();
	  
	  System.out.println("Open/Close amazon.com in the chrome browser");
	  
	  browserObject.get("http://www.amazon.com/");
	  
	  Thread.sleep(2000);
	  
	  browserObject.close();
  }
  @Test
  public void openingCnbcSite() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
	  
	  WebDriver browserObject = new ChromeDriver();
	  
	  System.out.println("Open/Close cnn.com in Chrome browser");
	  
	  browserObject.get("https:/www.cnn.com/");
	  
	  Thread.sleep(2000);
	  
	  browserObject.close();
	  
  }
  @Test
  public void openingYahooSite() throws InterruptedException {
  
	  System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
  
	  WebDriver browserObject = new ChromeDriver();
	  
	  System.out.println("Open/Close yahoo.com in chrome browser");
	  
	  browserObject.get("http:/www.yahoo.com/");
	  
	  Thread.sleep(2000);
	  
	  browserObject.close();
	  
	  
  }
  
  
}




