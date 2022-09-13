package testNgPackage_SimilarProgramPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderPractice {
	WebDriver browserObject;
	
	@Test(dataProvider = "dp")
		public void checkingCredentials(String username,String password,String msg) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
		browserObject = new ChromeDriver();
		browserObject.get("http://admin-demo.nopcommerce.com/login");
		
		WebElement userName = browserObject.findElement(By.name("Email"));
		WebElement passWord = browserObject.findElement(By.name("Password"));
		WebElement submitBtn = browserObject.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[2]/div[3]/label"));
		
		userName.clear();
		passWord.clear();
		submitBtn.click();
		Thread.sleep(3000);
		
		userName.sendKeys("username");
		passWord.sendKeys("password");
	}
  
	@DataProvider
	public Object[][]dp(){
		return new Object[][] {
			new Object[] {"admin","admin132","Wrong Credentials"},
			new Object[] {"admin","admnhhk","Wrong Credentials"},
			new Object[] {"admin@yourstore.com","admin","Test Pass"}
		};
			
	}	
	
  }

