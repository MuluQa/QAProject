package testNgPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ArrivalsImage_AddToBasket {
	WebDriver browserObject;
	
  @Test (priority =1)
  public void openingBrowser() throws InterruptedException{
	  
	  browserObject.get("http://practice.automationtesting.in/");
	  Thread.sleep(2000);
  }
  
  @Test (priority = 2)
  public void enteringUrl() throws InterruptedException {
	  
	  System.out.println("The URL + browserObject.getCurrntUrl");
	  Thread.sleep(2000);
  }
  
  @Test (priority = 3)
  public void ClikingOnShopButton() throws InterruptedException {
	  
	  browserObject.findElement(By.xpath("//*[@id=\"menu-item-40\"]/a")).click();
	  System.out.println("Shop Button clicked");
	  Thread.sleep(3000);
  }
  
  @Test (dependsOnMethods = "ClikingOnShopButton")
  public void ClikingOnHomeButton() throws InterruptedException {
	  
	  browserObject.findElement(By.xpath("//*[@id=\"content\"]/nav/a")).click();
	  System.out.println("Home Button Clicked");
	  Thread.sleep(3000);
  }
  
  @Test (priority = 4)
  public void HomePageThreeSliders() throws InterruptedException {
	  
	  browserObject.findElement(By.xpath("//*[@id=\"n2-ss-6-arrow-next\"]/img")).click();
	  browserObject.findElement(By.xpath("//*[@id=\"n2-ss-6-arrow-next\"]/img")).click();
	  browserObject.findElement(By.xpath("//*[@id=\"n2-ss-6-arrow-next\"]/img")).click();
	  System.out.println("The Three Sliders");
	  Thread.sleep(6000);
  }  
  
  @Test (priority = 5)
  public void ClikingTheImageInArravals() throws InterruptedException {
	  
	  WebElement Arravals = browserObject.findElement(By.xpath("//*[@id=\"text-22-sub_row_1-0-1-1-0\"]/h2"));
	  Arravals.click();
	  browserObject.navigate().forward();
	  
	  WebElement SeleniumRuby = browserObject.findElement(By.xpath("//*[@id=\"text-22-sub_row_1-0-2-0-0\"]/div/ul/li/a[1]/h3"));
	  SeleniumRuby.click();
	  browserObject.navigate().back();
	  
	  WebElement ThinkingInHTML = browserObject.findElement(By.xpath("//*[@id=\"text-22-sub_row_1-0-2-1-0\"]/div/ul/li/a[1]/h3"));
	  ThinkingInHTML.click();
	  browserObject.navigate().back();
	  
	  WebElement MasteringJavaScript= browserObject.findElement(By.xpath("//*[@id=\"text-22-sub_row_1-0-2-2-0\"]/div/ul/li/a[1]/h3"));  
	  MasteringJavaScript.click();
	  browserObject.navigate().back();
	  System.out.println("Three Images Clicked In Arravals");
	  Thread.sleep(6000);
  }
	  
  @Test (dependsOnMethods = "ClikingTheImageInArravals")
	  public void ClikingOnAddToBasketButton() throws InterruptedException{
	  
	  browserObject.findElement(By.xpath("//*[@id=\"text-22-sub_row_1-0-2-0-0\"]/div/ul/li/a[2]")).click();
	  Thread.sleep(6000);
	  browserObject.findElement(By.xpath("//*[@id=\"text-22-sub_row_1-0-2-2-0\"]/div/ul/li/a[2]")).click();
	  Thread.sleep(6000);
  }
  
	  @Test (dependsOnMethods = "ClikingOnAddToBasketButton")
	  public void ViewMenuItemWithPrice() throws InterruptedException {
	
		  browserObject.findElement(By.xpath("//*[@id=\"wpmenucartli\"]/a")).click();
		  Thread.sleep(6000);		  
  }
  
   @BeforeTest
   public void beforeTest() {
	   System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
	   browserObject = new ChromeDriver();
	   browserObject.manage().window().maximize();
   }

   @AfterTest
   public void afterTest() {
	   browserObject.close();
	  
	  
  }
  
	  
  }

