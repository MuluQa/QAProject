package seleniumPackageTwo;

import java.io.File;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class TakeScreenShotPractice {

				    public static void main(String[] args) throws InterruptedException {
			        // TODO Auto-generated method stub
			        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jayant\\Pictures\\qatraininimages\\chromedriver_win32\\chromedriver.exe");
			        WebDriver browserObject = new ChromeDriver();
			        browserObject.manage().window().maximize();
			        browserObject.get("http://demo.itlearn360.com/");
			        browserObject.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS) ;
			        
			        EventFiringWebDriver eventDriver = new EventFiringWebDriver(browserObject).register(new AbstractWebDriverEventListener() {
			            
			              public void onException(Throwable throwable, WebDriver browser) {
			                // Take the screenshot using the Webdriver.
			                File screen = ((TakesScreenshot)browserObject).getScreenshotAs(OutputType.FILE);
			                // Now you can copy the screenshot somewhere on your system.
			                try {
			                    FileUtils.copyFile(screen, new File("C:\\project\\exception.png"));
			                } catch (IOException e) {
			                    // TODO Auto-generated catch block
			                    e.printStackTrace();
			                }
			              }
			            });
			            try {
			                eventDriver.findElement(By.xpath("//*[@id=\"loginlabel\"]/div[1]/p/a")).click();
			            } catch (NoSuchElementException e) {   
			              // Triggering point for the <onException> event.
			                eventDriver.close();
			            }
			        browserObject.quit();
	}

}
