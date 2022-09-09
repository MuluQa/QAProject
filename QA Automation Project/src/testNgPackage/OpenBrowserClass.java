package testNgPackage;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OpenBrowserClass {
	WebDriver browserObject;
	
  @Test
  public void OpeningBrowser() throws InterruptedException{

	  System.out.println("The first test case of opening the browsr is passed");
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
	  
	  WebDriver browserObject = new ChromeDriver();
	  
	  browserObject.get("http://practice.automationtesting.in/");
	     
	  Thread.sleep(2000);
	  
	  browserObject.close();
	  
  }
  @Test
  public void EnterTheUrl() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
	  
	  WebDriver browserObject = new ChromeDriver();
	  
	  browserObject.get("http://practice.automationtesting.in/");
	   
	  System.out.println("url is "+ browserObject.getCurrentUrl());
	  
	  Thread.sleep(2000);
	  
	  browserObject.close();
	 
}
  @Test
  
  public void ClickOnTheShopButton() throws InterruptedException{
	  
	  	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
	  
		 WebDriver browserObject = new ChromeDriver();
		  
		 browserObject.get("http://practice.automationtesting.in/");
		  
		 WebElement clickElementShop = browserObject.findElement(By.xpath("//*[@id=\"menu-item-40\"]/a"));
		  	
		 clickElementShop.click();
		  		
		 System.out.println("Perform click on the shop button, using radiobutton method");
		
		 Thread.sleep(3000);
		  
		 browserObject.close();
	
}
  @Test
  
  public void ClickOnTheHomeButton() throws InterruptedException{
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
	  
	  WebDriver browserObject = new ChromeDriver();
	  
	  browserObject.get("http://practice.automationtesting.in/");
	  
	  browserObject.findElement(By.xpath("//*[@id=\"menu-item-40\"]/a")).click();
	  
	  browserObject.navigate().forward();
	  
	  browserObject.findElement(By.xpath("//*[@id=\"content\"]/nav/a")).click();
	  
	  System.out.println("Perform click on the Home button using navigat forward method.");
	    
	  Thread.sleep(6000);
	  
	  browserObject.close();
}
  @Test
  
  public void HomePageThreeSliders() throws InterruptedException {
 
	  System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
	  
	  WebDriver browserObject = new ChromeDriver();
	  
	  browserObject.get("http://practice.automationtesting.in/");
	  
	  browserObject.findElement(By.xpath("//*[@id=\"n2-ss-6-arrow-next\"]/img")).click();
	  
	  Thread.sleep(2000);
	  
	  browserObject.findElement(By.xpath("//*[@id=\"n2-ss-6-arrow-next\"]/img")).click();
	  
	  Thread.sleep(2000);
	  
	  browserObject.findElement(By.xpath("//*[@id=\"n2-ss-6-arrow-next\"]/img")).click();
	  
	  Thread.sleep(6000);
	  
	  browserObject.close();
	  
  }
  
  @Test
  
  public void ClikingImageArrivals() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
	  
	  WebDriver browserObject = new ChromeDriver();
	  
	  browserObject.get("http://practice.automationtesting.in/");
	  
	  browserObject.findElement(By.xpath("//*[@id=\"text-22-sub_row_1-0-1-1-0\"]/h2")).click();
	     
	  browserObject.navigate().forward();
	 
	  browserObject.findElement(By.xpath("//*[@id=\"text-22-sub_row_1-0-2-0-0\"]/div/ul/li/a[1]/img")).click();
       
	  browserObject.navigate().back();
	  
	  Thread.sleep(6000);
	  
	  browserObject.findElement(By.xpath("//*[@id=\"text-22-sub_row_1-0-2-1-0\"]/div/ul/li/a[1]/img")).click();
	  
	  browserObject.navigate().back();
	  
	  Thread.sleep(6000);
	    
	  browserObject.findElement(By.xpath("//*[@id=\"text-22-sub_row_1-0-2-2-0\"]/div/ul/li/a[1]/img")).click();
 
	  browserObject.navigate().back();
	  
	  Thread.sleep(6000);
	  
	  browserObject.close();
	 
	  }
  @Test
  
  public void AddTheBookIntotheBasket() throws InterruptedException {
	 
	  System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
	  
	  WebDriver browserObject = new ChromeDriver();
	  
	  browserObject.get("http://practice.automationtesting.in/");
	  
	  browserObject.findElement(By.xpath("//*[@id=\"text-22-sub_row_1-0-2-0-0\"]/div/ul/li/a[2]")).click();
	 
	 Thread.sleep(6000);
	 
	 browserObject.findElement(By.xpath("//*[@id=\"text-22-sub_row_1-0-2-2-0\"]/div/ul/li/a[2]")).click();
	  
	  Thread.sleep(6000);
	  
	  browserObject.close();
  }
  @Test
  
  public void ClickOnDescriptionTab() throws InterruptedException {
  
 System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
	  
	  WebDriver browserObject = new ChromeDriver();
	  
	  browserObject.get("http://practice.automationtesting.in/");
  
	  browserObject.findElement(By.xpath("//*[@id=\"text-22-sub_row_1-0-2-0-0\"]/div/ul/li/a[1]/img")).click();
  
	  browserObject.navigate().forward();
	  
	  Thread.sleep(6000);
	  
	  browserObject.findElement(By.xpath("//*[@id=\"product-160\"]/div[3]/ul/li[1]/a")).click();
	  
	  browserObject.navigate().back();
	 
	  browserObject.findElement(By.xpath("//*[@id=\"text-22-sub_row_1-0-2-2-0\"]/div/ul/li/a[1]/img")).click();
	  
	  browserObject.navigate().forward();
	  
	  browserObject.findElement(By.xpath("//*[@id=\"product-165\"]/div[3]/ul/li[1]/a")).click();
	  
	  Thread.sleep(6000);
	  
	  browserObject.close();
  }
  
}
