package testNgPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DependencyClass {
 
	WebDriver browserObject;
	@Test
   	 public void openingAmazonSite() throws InterruptedException {
        // 2. setup the property of WebDriver to set the dependency of method through chrome web browser
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
	// 3. Initialize WebDriver object through ChromeDriver class.
        browserObject = new ChromeDriver();
        System.out.println("Open /close  amazon.com in chrome browser");
	// 4. Open the web page http://www.amazon.com/ in first test case 
        browserObject.get("://www.amazon.com/");
	// 5. Thread.sleep is used to hold the part of code for given time limit. In this case take mouse over the thread and add Interrupted exception to this method
        Thread.sleep(2000);
        browserObject.close();
    }
   // 7. In next method to set the dependency use dependOMethods and pass the method name depended to.
    @Test(dependsOnMethods ="openingAmazonSite")
    public void openingCNBCSite() throws InterruptedException {
	// 2. setup the property of WebDriver to set the dependency of method through chrome web browser
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
	// 3. Initialize WebDriver object through ChromeDriver class.
        browserObject = new ChromeDriver();
        System.out.println("Open /close  cnn.com in chrome browser");
	// 4. Open the web page http://www.cnn.com/ in first test case 
        browserObject.get("https://www.cnbc.com/");
	// 5. Thread.sleep is used to hold the part of code for given time limit. In this case take mouse over the thread and add Interrupted exception to this method
        Thread.sleep(2000);
	 // 6. close the browser
        browserObject.close();
    }
    // 8. In next method to set the dependency use dependsOnMethods and pass the method name depend to.
    @Test(dependsOnMethods ="openingCNBCSite")
    public void openingYahooSite() throws InterruptedException {
        // 2. setup the property of WebDriver to set the dependency of method through chrome web browser
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
	// 3. Initialize WebDriver object through ChromeDriver class.
        browserObject = new ChromeDriver();
	 // 4. Open the web page http://www.yahoo.com/ in first test case
        System.out.println("Open /close  yahoo.com in chrome browser");
        browserObject.get("http://www.yahoo.com/");
	 // 5. Thread.sleep is used to hold the part of code for given time limit. In this case take mouse over the thread and add Interrupted exception to this method
        Thread.sleep(2000);
	 // 6. close the browser
        browserObject.close();
  }

}