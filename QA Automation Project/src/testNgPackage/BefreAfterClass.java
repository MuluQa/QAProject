package testNgPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BefreAfterClass {
	WebDriver browserObject;
	
	@Test
	public void performLogin() throws InterruptedException {
		
		browserObject.get("https://admin-demo.nopcommerce.com/login");
		
		WebElement username = browserObject.findElement(By.name("Email"));
		
		WebElement password = browserObject.findElement(By.name("Password"));
		
		WebElement submitBtn = browserObject.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button"));
		
		username.clear();
		
		username.sendKeys("admin@yourstore.com");
		
		password.clear();
		
		password.sendKeys("admin");
		
		submitBtn.click();
		
		Thread.sleep(2000);
	}
	
	@BeforeTest
	public void beforeTest() {
		
		System.out.println("--@beforeTest, set the browser, maximaized the window");
	
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe" );
		
		browserObject = new ChromeDriver();
		
		browserObject.manage().window().maximize();
		
	}
	
	@AfterTest
	public void afterTest() {
		
		browserObject.close();
		
		
		
}
}