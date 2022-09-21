package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		
		WebDriver browserObject = new ChromeDriver();
		
		browserObject.manage().window().maximize();
		
		browserObject.get("https://training.qaonlinetraining.com/testPage.php");
		
		WebElement checkboxBike = browserObject.findElement(By.xpath("/html/body/form/input[7]"));
		checkboxBike.click();
		
		WebElement checkboxBoat = browserObject.findElement(By.xpath("/html/body/form/input[9]"));
		checkboxBoat.click();
		
		
		Thread.sleep(3000);
		//WebElement checkboxCar = browserObject.findElement(By.xpath("/html/body/form/input[8]"));
		//checkboxCar.click();
		
		WebElement checkboxHorse = browserObject.findElement(By.xpath("/html/body/form/input[10]"));
		checkboxHorse.click();
		
		WebElement submitButton = browserObject.findElement(By.xpath("/html/body/form/input[11]"));
		submitButton.click();
		Thread.sleep(3000);
		browserObject.close();

	}

}
