package testNgPackage_SimilarProgramPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PriorityTestTwo {
  WebDriver browserObject;
  
  @Test(priority = 1)
  public void OpeningItLearn360page() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
	  browserObject = new ChromeDriver();
	  browserObject.get("https://www.itlearn360.com");
	  Thread.sleep(3000);
	  browserObject.close();  
  }
  
	  @Test(priority = 2)
	  public void OpeningGitHubSite() throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
		  browserObject = new ChromeDriver();
		  browserObject.get("https://www.github.com");
		  Thread.sleep(3000);
		  browserObject.close();
	  }
	  
	  @Test(priority = 3)
		  public void OpeningDemosite() throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
		  browserObject = new ChromeDriver();
		  browserObject.get("https://admin-demo.nopcommerce.com/login");
		  Thread.sleep(3000);
		  browserObject.close();
	  }
  }

