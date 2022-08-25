package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver browserObject;
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		
		browserObject =new ChromeDriver();
		
		browserObject.get("http://www.google.com/");
		
		WebElement blogLink = browserObject.findElement(By.linkText("Gmail"));
		
		if (blogLink.isDisplayed()){
			
			System.out.println("Image link is displaed using LinkText properly");
			
		}else {
			
			System.out.println("Unable to find Gmail");
		}
		
		browserObject.close();
		
			
			
		}
	}


