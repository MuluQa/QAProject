package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionExample {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
		
		WebDriver browserObject = new ChromeDriver();
		
		browserObject.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		Actions action = new Actions(browserObject);
		
		WebElement rightClickElement = browserObject.findElement(By.xpath("/html/body/div/section/div/div/div/p/span"));
		
		action.contextClick(rightClickElement).build().perform();
		
		Thread.sleep(3000);
		
		browserObject.close();
		
		
		

	}

}
