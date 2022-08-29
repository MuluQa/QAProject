package testNgPackage;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OpeningBrowserClassOne {
	WebDriver browserObject;
	
	  @Test
	  public void OpeningBrowser() throws InterruptedException{

		  System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
		  
		  WebDriver browserObject = new ChromeDriver();
		  
		  browserObject.get("http://practice.automationtesting.in/");
		  
		  Thread.sleep(2000);
		  
		  System.out.println("url is "+ browserObject.getCurrentUrl());
		  

		  WebElement clickElementShop = browserObject.findElement(By.xpath("//*[@id=\"menu-item-40\"]/a"));
		  	
		  clickElementShop.click();
		  
		  Thread.sleep(2000);
		  
		  System.out.println("Perform click on the shop button, using radiobutton method");
	
		  
		  browserObject.findElement(By.xpath("//*[@id=\"content\"]/nav/a")).click();
		  
		  System.out.println("Perform click on the Home button using navigat forward method.");
		  
		  
		  browserObject.findElement(By.xpath("//*[@id=\"n2-ss-6-arrow-next\"]/img")).click();
		  
		  Thread.sleep(3000);
		  
		  browserObject.findElement(By.xpath("//*[@id=\"n2-ss-6-arrow-next\"]/img")).click();
		  
		  Thread.sleep(3000);
		  
		  browserObject.findElement(By.xpath("//*[@id=\"n2-ss-6-arrow-next\"]/img")).click();
		  
		  Thread.sleep(3000);
		  
		  System.out.println("Three Sliders");
		  
		  
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
		  
		  
		  browserObject.findElement(By.xpath("//*[@id=\"text-22-sub_row_1-0-2-0-0\"]/div/ul/li/a[2]")).click();
			 
		  Thread.sleep(3000);
			 
		  browserObject.findElement(By.xpath("//*[@id=\"text-22-sub_row_1-0-2-2-0\"]/div/ul/li/a[2]")).click();
			  
		  System.out.println("Adding books into the basket");
		  Thread.sleep(3000);
		  
		  	browserObject.findElement(By.xpath("//*[@id=\"text-22-sub_row_1-0-2-0-0\"]/div/ul/li/a[1]/img")).click();
		  
			  browserObject.navigate().forward();
			  
			  Thread.sleep(3000);
			  
			  browserObject.findElement(By.xpath("//*[@id=\"product-160\"]/div[3]/ul/li[1]")).click();
			  
			  browserObject.navigate().back();
			 
			  browserObject.findElement(By.xpath("//*[@id=\"text-22-sub_row_1-0-2-2-0\"]/div/ul/li/a[1]/img")).click();
			  
			  browserObject.navigate().forward();
			  
			  browserObject.findElement(By.xpath("//*[@id=\"product-165\"]/div[3]/ul/li[1]")).click();
			 
			 System.out.println("Clicking in description tab");
			 
			 Thread.sleep(6000);
			 
			 browserObject.close();
			 
	  }	 
	 
}
	  