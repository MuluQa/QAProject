package testNgPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ArrivalImageReviews {
	
	WebDriver browserObject;
	
  @Test(priority =1)
  public void openingBrowser() throws InterruptedException {
	  
	  browserObject.get("http://practice.automationtesting.in/");
  }
	  
	  @Test(dependsOnMethods = "openingBrowser")
	  public void OpningUrl() throws InterruptedException {
	  
	  System.out.println("the Url " + browserObject.getCurrentUrl());
	  Thread.sleep(3000);
	  
	  }
	  
	  @Test (dependsOnMethods = "OpningUrl")
	  public void ClickingOnShopButton() throws InterruptedException {
	   
	  WebElement clickElementShop = browserObject.findElement(By.xpath("//*[@id=\"menu-item-40\"]"));
	 
	  clickElementShop.click();
	  
	  System.out.println("Cliking the Shop page is sucssful");
	  Thread.sleep(3000);
	  }
	  
	  @Test(dependsOnMethods = "ClickingOnShopButton")
	  public void ClickOnHomeButton() throws InterruptedException{
	  
	  browserObject.findElement(By.xpath("//*[@id=\"content\"]/nav/a")).click();
	    
	  Thread.sleep(3000);
	  
	  System.out.println("Cliking Home page is Sucssful");
	  }
	  
	  @Test(dependsOnMethods = "ClickOnHomeButton")
	  public void MoveToThreeSliders() throws InterruptedException {
	  
	  browserObject.findElement(By.xpath("//*[@id=\"n2-ss-6-arrow-next\"]/img")).click();
	  
	  Thread.sleep(2000);
	  
	  browserObject.findElement(By.xpath("//*[@id=\"n2-ss-6-arrow-next\"]/img")).click();
	  
	  Thread.sleep(2000);
	  
	  browserObject.findElement(By.xpath("//*[@id=\"n2-ss-6-arrow-next\"]/img")).click();
	  
	  Thread.sleep(2000);
	  
	  System.out.println("The three sliders of the page");
	  }
	  
	  @Test(dependsOnMethods = "MoveToThreeSliders")
	  public void clickingImageInArrivals() throws InterruptedException{
	  
	  WebElement Arrivals= browserObject.findElement(By.xpath("//*[@id=\"text-22-sub_row_1-0-1-1-0\"]/h2"));  
	  Arrivals.click();
	  browserObject.navigate().forward();
	 Thread.sleep(3000);
	  
	  WebElement firstImageInArrivals = browserObject.findElement(By.xpath("//*[@id=\"text-22-sub_row_1-0-2-0-0\"]/div/ul/li/a[1]/img"));
	  firstImageInArrivals.click();  
	  browserObject.navigate().back();
	  Thread.sleep(3000);
	  
	  WebElement SecondImageInArrivals = browserObject.findElement(By.xpath("//*[@id=\"text-22-sub_row_1-0-2-1-0\"]/div/ul/li/a[1]/img"));
	  SecondImageInArrivals.click();
	  browserObject.navigate().back();
	  Thread.sleep(3000);
	  
	  WebElement ThirdImageInArrivals = browserObject.findElement(By.xpath("//*[@id=\"text-22-sub_row_1-0-2-2-0\"]/div/ul/li/a[1]/img"));
	  ThirdImageInArrivals.click();
	  browserObject.navigate().back();    
	  Thread.sleep(3000);
	  
	  System.out.println( "the image in Arrival is run succusfuly");
	  }
	  
	  @Test(dependsOnMethods = "clickingImageInArrivals")
	  public void addingBooksInBasket() throws InterruptedException{
		  
	  browserObject.findElement(By.xpath("//*[@id=\"text-22-sub_row_1-0-2-0-0\"]/div/ul/li/a[2]")).click();
	  
	  Thread.sleep(3000);

	  browserObject.findElement(By.xpath("//*[@id=\"text-22-sub_row_1-0-2-2-0\"]/div/ul/li/a[2]")).click();
	  
	  System.out.println("Adding book into the basket");
	  
	  Thread.sleep(3000);
	  
	  }
	  @Test(dependsOnMethods = "MoveToThreeSliders" )
	  public void clickingOnReviewsTab() throws InterruptedException {
	  
	  browserObject.findElement(By.xpath("//*[@id=\"text-22-sub_row_1-0-2-0-0\"]/div/ul/li/a[1]/img")).click();
	  
	  browserObject.navigate().forward();
	  Thread.sleep(3000);
	  
	  browserObject.findElement(By.className("reviews_tab")).click();
	  
	  browserObject.navigate().back();
	  Thread.sleep(3000);
	  
	  browserObject.findElement(By.xpath("//*[@id=\"text-22-sub_row_1-0-2-2-0\"]/div/ul/li/a[1]/img")).click();
	  
	  browserObject.navigate().forward();
	  Thread.sleep(3000);
	   
	  browserObject.findElement(By.className("reviews_tab")).click();
	  
	  Thread.sleep(6000);
	  
	  System.out.println("The reveiws tab is clickable");
	  
	  
  }
	  @BeforeTest
	  public void beforeTest(){
		  
		  System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
		  
		  browserObject = new ChromeDriver();
		  
		  browserObject.manage().window().maximize();
  }
	  @AfterTest
	  public void afterTest() {
	  
		browserObject.close();
		  
	  }
}
