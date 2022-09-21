package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
		
		WebDriver browserObject = new ChromeDriver();
		
		browserObject.get("https://www.google.com/");
		
		//checking if the text is linked or not
		
		WebElement blogLink = browserObject.findElement(By.linkText("Gmail"));
		
		if (blogLink.isDisplayed()) {
			System.out.println("Gmail link is displayed using LinkText");
		}
		else {
			System.out.println("Unable to find Gmail");
		}
		browserObject.close();	
	}

}
