package seleniumPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
		
		WebDriver browserObject = new ChromeDriver();

		browserObject.get("https://www.itlearn360.com/");
		
		int count = 0;
		
		List<WebElement>alllinks = browserObject.findElements(By.tagName("a"));
		
		for(WebElement link: alllinks){
			
			System.out.println(link.getAttribute("href"));
			count ++;
		}
		
		System.out.println("total number of links present: " +count);
		
		browserObject.close();
	}

}
