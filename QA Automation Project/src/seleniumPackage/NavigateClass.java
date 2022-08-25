package seleniumPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
		
		WebDriver browserObject = new ChromeDriver();
		
		browserObject.get("https://www.facebook.com/");
		
		System.out.println("This is: "+ browserObject.getTitle() +"Website");
		
		System.out.println("url is: " + browserObject.getCurrentUrl());
		Thread.sleep(3000);
		
		browserObject.navigate().to("http://www.instagram.com/");
		
		System.out.println("This is:"  +browserObject.getTitle() +"Website");
		
		System.out.println("url is: " + browserObject.getCurrentUrl());
		
		Thread.sleep(3000);
		
		browserObject.navigate().to("http:/www.twitter.com");
		
		System.out.println("This is: "+browserObject.getTitle() +"Website");
		
		System.out.println("url is: "+browserObject.getCurrentUrl());
		
		Thread.sleep(3000);
		
		browserObject.navigate().back();
		
		System.out.println("This is: " + browserObject.getTitle() + "Website");
		
		System.out.println("url is: " +browserObject.getCurrentUrl() +"Website");
		
		Thread.sleep(3000);
		browserObject.navigate().back();
		
		Thread.sleep(3000);
		
		browserObject.navigate().forward();
		
		System.out.println("This is: "+ browserObject.getTitle()+"Website");
		
		System.out.println("url is: "+ browserObject.getCurrentUrl()+"Website" );
		
		Thread.sleep(3000);
		browserObject.close();
		
		
		
		
		
		
		

	}

}
