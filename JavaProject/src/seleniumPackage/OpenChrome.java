package seleniumPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChrome {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");

		WebDriver browserObject = new ChromeDriver();
		
		browserObject.get("https://www.google.com/");
		
		System.out.println("Opening google chrome");
		
		Thread.sleep(2000);
		
		browserObject.close();
		
		
		
		
		
		
		

	}

}
