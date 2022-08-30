package testNgPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ArrivalImageReviews {
  @Test
  public void ReviwingImage() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
	  
	  WebDriver browserObject = new ChromeDriver();
	  
	  browserObject.get( "http://practice.automationtesting.in/");
	  
	  
	  System.out.println("the url " + browserObject.getCurrentUrl());
	  
	  
	  WebElement clickElementShop = browserObject.findElement(By.xpath("//*[@id=\"menu-item-40\"]"));
	 
	  clickElementShop.click();
	  
	  System.out.println("Cliking the Shop page is sucssful");
	  
	  
	  browserObject.findElement(By.xpath("//*[@id=\"content\"]/nav/a")).click();
	    
	  Thread.sleep(2000);
	  
	  System.out.println("Cliking Home page is Sucssful");
	  
	  
	  browserObject.findElement(By.xpath("//*[@id=\"n2-ss-6-arrow-next\"]/img")).click();
	  
	  Thread.sleep(2000);
	  
	  browserObject.findElement(By.xpath("//*[@id=\"n2-ss-6-arrow-next\"]/img")).click();
	  
	  Thread.sleep(2000);
	  
	  browserObject.findElement(By.xpath("//*[@id=\"n2-ss-6-arrow-next\"]/img")).click();
	  
	  Thread.sleep(2000);
	  
	  System.out.println("The three sliders of the page");
	  
	  
	  browserObject.findElement(By.xpath("//*[@id=\"text-22-sub_row_1-0-1-1-0\"]/h2")).click();  
	 
	  browserObject.navigate().forward();
	  
	  Thread.sleep(2000);
	  
	  browserObject.findElement(By.xpath("//*[@id=\"text-22-sub_row_1-0-2-0-0\"]/div/ul/li/a[1]/img")).click();
	  
	  browserObject.navigate().back();
	  
	  Thread.sleep(3000);
	  
	  browserObject.findElement(By.xpath("//*[@id=\"text-22-sub_row_1-0-2-1-0\"]/div/ul/li/a[1]/img")).click();
	  
	  browserObject.navigate().back();
	  
	  Thread.sleep(3000);
	  
	  browserObject.findElement(By.xpath("//*[@id=\"text-22-sub_row_1-0-2-2-0\"]/div/ul/li/a[1]/img")).click();
	  
	  browserObject.navigate().back();
	  
	  Thread.sleep(3000);
	  
	  System.out.println( "the image in Arrival is run succusfuly");
	  
	  
	  browserObject.findElement(By.xpath("//*[@id=\"text-22-sub_row_1-0-2-0-0\"]/div/ul/li/a[2]")).click();
	   
	  Thread.sleep(3000);
	  
	  browserObject.findElement(By.xpath("//*[@id=\"text-22-sub_row_1-0-2-2-0\"]/div/ul/li/a[2]")).click();
	  
	  Thread.sleep(3000);
	  
	  System.out.println("Adding book into the basket");
	  
	  
	  browserObject.findElement(By.xpath("//*[@id=\"text-22-sub_row_1-0-2-0-0\"]/div/ul/li/a[1]/img")).click();
	  
	  browserObject.navigate().forward();
	  
	  browserObject.findElement(By.xpath("//*[@id=\"product-160\"]/div[3]/ul/li[2]")).click();
	  
	  browserObject.navigate().back();
	  
	  Thread.sleep(6000);
	  
	  browserObject.findElement(By.xpath("//*[@id=\"text-22-sub_row_1-0-2-2-0\"]/div/ul/li/a[1]/img")).click();
	  
	  browserObject.navigate().forward();
	   
	  browserObject.findElement(By.xpath("//*[@id=\"product-165\"]/div[3]/ul/li[2]")).click();
	  
	  Thread.sleep(6000);
	  
	  System.out.println("The reveiws tab is clickable");
	  
	  browserObject.close();
	  
	  
	  
  }
}
