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
		
		WebElement radioButtonFemale = browserObject.findElement(By.xpath("/html/body/form/input[4]"));
		
		radioButtonFemale.click();
		
		Thread.sleep(2000);
		
		WebElement radioButtonMale = browserObject.findElement(By.xpath("/html/body/form/input[5]"));
		
		radioButtonMale.click();
		
		//WebElement radioButtonOther = browserObject.findElement(By.xpath("//*[@id=\"other\"]"));
		
		//radioButtonOther.click();
		
		Thread.sleep(3000);
		
		WebElement submitButton = browserObject.findElement(By.xpath("/html/body/form/input[11]"));
		
		submitButton.click();
		
		Thread.sleep(3000);
		
		System.out.println("select the last option");
		
		browserObject.close();
		
	}

}
