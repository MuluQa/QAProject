package testNgPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeAfterClass {
  WebDriver browserObject;
	@Test
	public void PerformingLogIn() throws InterruptedException {
		
		browserObject.get("https://admin-demo.nopcommerce.com/login");
	
		WebElement username = browserObject.findElement(By.name("Email"));
		
		WebElement password = browserObject.findElement(By.id("Password"));
		
		WebElement login = browserObject.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button"));
		
		browserObject.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[2]/div[3]/label")).click();
	
		
		username.clear();
		username.sendKeys("admin@yourstore.com");
		
		password.clear();
		password.sendKeys("admin");
		
		login.click();
		

		System.out.println("login is sucssful");
		
	
	}
	
	@BeforeTest
	public void beforeTest() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
		
		browserObject = new ChromeDriver();
		
		browserObject.manage().window().maximize();
		
	}
	@AfterTest
	public void afterTest() {
		browserObject.close();
	}
	

}
