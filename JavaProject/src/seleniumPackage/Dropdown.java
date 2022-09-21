package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException  {
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
		
		WebDriver browserObject = new ChromeDriver();
		
		browserObject.get("http://training.qaonlinetraining.com/testPage.php");
		
		Select countrySelect = new Select(browserObject.findElement(By.name("country")));
		
		countrySelect.selectByVisibleText("USA");
		Thread.sleep(3000);

		countrySelect.selectByVisibleText("Ethiopia");
		Thread.sleep(3000);
		
		countrySelect.selectByVisibleText("France");
		Thread.sleep(3000);
		
		countrySelect.selectByVisibleText("India");
		Thread.sleep(3000);
		
		System.out.println("In dropdown, it selects the last selected Value which is (India)");
		
		Select skillSelect = new Select(browserObject.findElement(By.name("skill")));
		
		skillSelect.selectByVisibleText("Programming");
		
		System.out.println("selectByVisibleText(\"Database");
	
		browserObject.findElement(By.xpath("/html/body/form/input[11]")).click();
		Thread.sleep(6000);
		
		System.out.println("Form Fill-up Succesfull");

		
		browserObject.close();

	}

}
