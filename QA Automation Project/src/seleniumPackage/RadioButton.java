package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
		
		WebDriver browserObject = new ChromeDriver();
		
		browserObject.get("http://training.qaonlinetraining.com/testPage.php");
		
		WebElement radioButtonFemale =browserObject.findElement(By.xpath("/html/body/form/input[4]"));
		
		WebElement radioButtonMale = browserObject.findElement(By.xpath("/html/body/form/input[5]"));
		
		//WebElement radioButtonOther = browserObject.findElement(By.xpath("//*[@id=\"other\"]"));
	
		WebElement submitButton = browserObject.findElement(By.xpath("/html/body/form/input[11]"));
		
		radioButtonFemale.click();
		
		Thread.sleep(6000);
		
		radioButtonMale.click();
		
		Thread.sleep(3000);
		
		radioButtonMale.click();
		
		Thread.sleep(3000);
		
		//radioButtonOther.click();
		
		//Thread.sleep(3000);
		
		submitButton.click();
		
		browserObject.close();
		
		
		
		
		
		
		
		
		
		
	}

}
