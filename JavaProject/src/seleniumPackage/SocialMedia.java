package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SocialMedia {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
		
		WebDriver browserObject = new ChromeDriver();
		
		browserObject.get("https://www.itlearn360.com/");
		
		browserObject.findElement(By.className("fa-facebook")).click();
		
		browserObject.navigate().back();
		
		Thread.sleep(3000);
		browserObject.findElement(By.className("fa-twitter")).click();
		
		browserObject.navigate().back();
		Thread.sleep(3000);
		
		browserObject.findElement(By.className("fa-instagram")).click();
		
		browserObject.navigate().back();
		Thread.sleep(3000);
		
		browserObject.findElement(By.className("fa-youtube")).click();
		
		browserObject.navigate().back();
		Thread.sleep(3000);
		
		browserObject.findElement(By.className("fa-linkedin")).click();
		
		browserObject.navigate().back();
		Thread.sleep(3000);
		
		
		browserObject.close();
		
		
		
		
		
		
		

	}

}
