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
	public void checking(String userName, String password,String msg) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
		
		WebDriver browserObject = new ChromeDriver();
		
		browserObject.get("http://admin-demo.nopcommerce.com/login");
		
		WebElement Username = browserObject.findElement(By.name("Email"));
		
		WebElement Password = browserObject.findElement(By.name("Password"));
		
		WebElement submitBtn = browserObject.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button"));
		
		Username.clear();
		
		Username.sendKeys(userName);
		
		Password.clear();
		
		Password.sendKeys(password);
		
		submitBtn.click();
		
		Thread.sleep(2000);
	}
	
	@DataProvider
	
	public Object[][]dp(){
		
		return new Object[][] {
			
			new Object[] {"admin","admin132","Wrong Credentials"},
			new Object[] {"admin","admnhhj","Wrong Credentials"},
			new Object[] {"admin@yourstore.com","admin","Test passed"},
		};
		
	}
	
 
}
