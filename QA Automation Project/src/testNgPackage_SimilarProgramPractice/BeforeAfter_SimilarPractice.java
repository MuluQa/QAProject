package testNgPackage_SimilarProgramPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeAfter_SimilarPractice {
	WebDriver browserObject;
	  
	  @Test(priority = 1)
	  public void OpeningBrowserTwo() throws InterruptedException {
		  
		  browserObject.get("http://practice.automationtesting.in/"); 
		  
		  Thread.sleep(2000);	
	  }
		 @Test(dependsOnMethods = "OpeningBrowserTwo")
		 public void openingUrl() throws InterruptedException{
		  
		   System.out.println("url is " + browserObject.getCurrentUrl());
		   
		   Thread.sleep(2000);
		 
	 } 
		@Test(dependsOnMethods = "openingUrl")
		public void ShopButton() throws InterruptedException {

		  WebElement clickElementShop = browserObject.findElement(By.xpath("//*[@id=\"menu-item-40\"]/a"));
		  	
		  clickElementShop.click();
		  
		  Thread.sleep(2000);
		}
		
		 @Test (dependsOnMethods = "ShopButton") 
		 
		 public void clickHomeButton() throws InterruptedException{
			 
		  browserObject.findElement(By.xpath("//*[@id=\"content\"]/nav/a")).click();
		  
		  System.out.println("Perform click on the Home button using navigat forward method.");
		  
		  Thread.sleep(2000);	 
		  }  
		  
		 @Test(dependsOnMethods = "clickHomeButton")
		 
		 public void threeSliders() throws InterruptedException {
		 
		  browserObject.findElement(By.xpath("//*[@id=\"n2-ss-6-arrow-next\"]/img")).click();
		  
		  Thread.sleep(2000);
		  
		  browserObject.findElement(By.xpath("//*[@id=\"n2-ss-6-arrow-next\"]/img")).click();
		  
		  Thread.sleep(3000);
		  
		  browserObject.findElement(By.xpath("//*[@id=\"n2-ss-6-arrow-next\"]/img")).click();
		  
		  Thread.sleep(3000);
		  
		  System.out.println("Three Sliders");
		  
		 }
		 
		 @Test (dependsOnMethods= "threeSliders")
		 
		 public void arrivalImage() throws InterruptedException {
		  
		  browserObject.findElement(By.xpath("//*[@id=\"text-22-sub_row_1-0-1-1-0\"]/h2")).click();
		  
		  browserObject.navigate().forward();
		  
		  Thread.sleep(3000);
		  
		  browserObject.findElement(By.xpath("//*[@id=\"text-22-sub_row_1-0-2-0-0\"]/div/ul/li/a[1]/img")).click();
		
		  browserObject.navigate().back();
		  
		  Thread.sleep(3000);
		  
		  browserObject.findElement(By.xpath("//*[@id=\"text-22-sub_row_1-0-2-1-0\"]/div/ul/li/a[1]/img")).click();
		
		  browserObject.navigate().back();
		  
		   Thread.sleep(3000);
		    
		  browserObject.findElement(By.xpath("//*[@id=\"text-22-sub_row_1-0-2-2-0\"]/div/ul/li/a[1]/img")).click();
		
		  browserObject.navigate().back();
		  
		  Thread.sleep(3000);
		  
		  System.out.println("Cliking the Image using navigate back and forword method");
		  

		 }  
		  
		 @Test (dependsOnMethods = "arrivalImage")
		 public void addingBookIntoBasket() throws InterruptedException {
			 
		browserObject.findElement(By.xpath("//*[@id=\"text-22-sub_row_1-0-2-0-0\"]/div/ul/li/a[2]")).click();
			 
		  browserObject.findElement(By.xpath("//*[@id=\"text-22-sub_row_1-0-2-2-0\"]/div/ul/li/a[2]")).click();
			  
		  System.out.println("Adding books into the basket");
		  
		  Thread.sleep(6000);
		  
		 }
		 
		 @Test(dependsOnMethods = "addingBookIntoBasket" )
		 
		 public void clickingOnDescription() throws InterruptedException {
		 	
			 browserObject.findElement(By.xpath("//*[@id=\"text-22-sub_row_1-0-2-0-0\"]/div/ul/li/a[1]/img")).click();
			  
			  browserObject.navigate().forward();
			  
			  Thread.sleep(6000);
			  
			  browserObject.findElement(By.xpath("//*[@id=\"product-160\"]/div[3]/ul/li[1]/a")).click();
			  
			  browserObject.navigate().back();
			 
			  browserObject.findElement(By.xpath("//*[@id=\"text-22-sub_row_1-0-2-2-0\"]/div/ul/li/a[1]/img")).click();
			  
			  browserObject.navigate().forward();
			  
			  browserObject.findElement(By.xpath("//*[@id=\"product-165\"]/div[3]/ul/li[1]/a")).click();
			  
			  Thread.sleep(6000);
	  }
	  
			 @BeforeTest
			    public void beforeTest() {
			        System.out.println("--@beforeTest, set the browser, maximise the window");
				
			        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
			        browserObject = new ChromeDriver();
				
			        browserObject.manage().window().maximize();
			    }
				
			    @AfterTest
			    public void afterTest() {
			        System.out.println("--@afterTest, closing the browser window");
				// 15. Close the web browser.   
			        browserObject.close();
		  
	  }
}
