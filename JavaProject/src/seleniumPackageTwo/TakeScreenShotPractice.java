package seleniumPackageTwo;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenShotPractice {

		WebDriver driver;
		public static void main(String[] args) {
			System.setProperty("webdriver.chorome.driver","C:\\Program Files\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			
			driver.get("https://www.itlearn360.com");
			
			File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

			try {
				FileUtils.copyFile(screenshot,new File("C:webdriver.chorome.driver","C:\\Program Files\\chromedriver.exe"));
			}
				catch (IOException e) {
			        System.out.println(e.getMessage());
		    }
		
		    
		driver.close();

	}

}
