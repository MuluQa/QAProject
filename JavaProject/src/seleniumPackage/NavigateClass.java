package seleniumPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateClass {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
		
		WebDriver browserObject = new ChromeDriver();
		
		//First WebSite
		browserObject.get("https://www.facebook.com/");
		
		System.out.println("This is" + browserObject.getTitle()+"website");
		
		System.out.println("The Url is" + browserObject.getCurrentUrl());
		
		Thread.sleep(3000);
		
		//moving to next WebSite
		browserObject.navigate().to("http://www.instagram.com/");
		
		System.out.println("This is "+ browserObject.getTitle()+ "website");
		
		System.out.println("The Url" + browserObject.getCurrentUrl());
		
		Thread.sleep(3000);
		
		//moving to next WebSite
		browserObject.navigate().to("https://www.twitter.com");
		
		System.out.println("This is "+ browserObject.getTitle()+ "website");
		
		System.out.println("This is "+ browserObject.getCurrentUrl());
		
		Thread.sleep(3000);
		
		//moving back to previous WebSite
		
		browserObject.navigate().back();
		Thread.sleep(3000);
		
		browserObject.navigate().back();
		Thread.sleep(3000);
		
		browserObject.navigate().forward();
		Thread.sleep(3000);
		
		browserObject.close();
		
		

	}

}
