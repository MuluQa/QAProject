package seleniumPackageTwo;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static boolean isValid(String url) {
		// TODO Auto-generated method stub
		try {
			new URL(url).toURI();
			return true;
		}
		catch(Exception e) {
			return false;
		}
	}
	public static void main (String[] args) {
	WebDriver driver;
	
	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	String homePage = "http://demo.itlearn360.com";
	driver.get(homePage);
	List<WebElement>allLinks = driver.findElements(By.tagName("a"));
	
	for (WebElement link:allLinks) {
		String url = link.getAttribute("href");
		Boolean isvalid = isValid(url);
	if(isvalid) {
		try {
			HttpURLConnection huc = (HttpURLConnection)(new URL(url).openConnection());
			huc.setRequestMethod("HEAD");
			huc.connect();
			int respCode = huc.getResponseCode();
			if(respCode>=400) {
				System.out.println(url + "is a broken link");
			}
			else {
				System.out.println(url + "is a valid link");
				
			}
		}catch (MalformedURLException e) {
			System.out.println(url + "is malformed");
			}
		catch(ClassCastException e) {
			System.out.println(url +"is invalid Link");
			}
		
		catch (IOException e) {
			System.out.println(url + "is a invalid link");	
		}
	}
	}
	driver.close();
	}
}
