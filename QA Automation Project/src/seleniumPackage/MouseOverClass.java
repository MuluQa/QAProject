package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		
		WebDriver browserObject = new ChromeDriver();
		
		browserObject.get("https://www.amazon.com/");
		
		//Thread.sleep(3000);
		WebElement element = browserObject.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]"));
		
		Actions action = new Actions(browserObject);
		
		System.out.println("Mouse is over the -Hello, SIGN IN - option");
		
		action.moveToElement(element).build().perform();
		
		Thread.sleep(3000);
		
		browserObject.findElement(By.xpath("//*[@id=\"nav-al-wishlist\"]/a[1]/span")).click();
		
		browserObject.close();
		
		
	}

}
