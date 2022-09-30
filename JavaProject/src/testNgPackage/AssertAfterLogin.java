package testNgPackage;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AssertAfterLogin {
	WebDriver browserObject;
	
  @Test
  public void performLogin() throws InterruptedException {
	  	 
	 browserObject.get("https://admin-demo.nopcommerce.com/login");
	 
	 WebElement username = browserObject.findElement(By.name("Email"));
	 
	 WebElement password = browserObject.findElement(By.id("Password"));
	 
	 WebElement submitBtn = browserObject.findElement(By.className("button-1"));
	 
	 username.clear();
	 username.sendKeys("admin@yourstore.com");
	 
	 password.clear();
	 password.sendKeys("admin");
	 
	 submitBtn.click();
	 
	 Thread.sleep(2000);
	 
	 
  }
  
  @Test(dependsOnMethods = "performLogin")
  public void assertHomePage() throws InterruptedException {
	  
	  String expectedTextFromPage= "Dashboard";
	  
	  String actualTextFromHomePage = browserObject.findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/h1")).getText();
	  
	  assertEquals(actualTextFromHomePage,expectedTextFromPage);
	  
	  Thread.sleep(3000);
	
  }
	  
	  @BeforeTest
	  public void beforeTest() {
		  
		  System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
		  
		  browserObject = new ChromeDriver();
		  
		  browserObject.manage().window().maximize();
	  }
	  
	  @AfterTest
	  public void afterTest() {
		  
		  browserObject.close();
	  }
	  
  }

