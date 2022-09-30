package testNgPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderClass {
	
  WebDriver browserObject;
  
	@Test(dataProvider = "dp")
	public void checking(String userName, String passWord, String msg) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
		
		browserObject = new ChromeDriver();
		
		browserObject.get("https://admin-demo.nopcommerce.com/login");
		
		WebElement username = browserObject.findElement(By.name("Email"));
		
		WebElement password = browserObject.findElement(By.id("Password"));
		
		WebElement submitBtn = browserObject.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button"));
		
		username.clear();
		
		username.sendKeys(userName);
		
		password.clear();
		
		password.sendKeys(passWord);
		
		submitBtn.click();
		
		System.out.println("msg");
		
		Thread.sleep(2000);
		
		browserObject.close();
		
	
	}
		@DataProvider
		public Object[][]dp() {
			
		return new Object[][] {
			new Object[] {"admin", "admin123", "Wrong Credentials"},
			new Object[] {"admin", "adminhhkj", "Wrong Credentials"},
			new Object[] {"admin@yourstore.com", "admin", "Test passed"}
			};
		
			}
		}
		
		
		
	

