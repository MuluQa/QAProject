package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ClickingOnShop {
	WebDriver driver;
	
	@Given("I am On google page {string}")
	public void i_am_on_google_page(String string) {
	   System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe" );
	   driver = new ChromeDriver();
	   driver.get(string);
	}


	@Then("I search for {string}")
	public void i_search_for(String string) {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe" );
		   driver = new ChromeDriver();
		   driver.get(string);
	}

	@When("I click on shop element")
	public void i_click_on_shop_element() {
	   driver.findElement(By.xpath("//*[@id=\"menu-item-40\"]/a")).click();
	}
	@When("I wait for {int} seconds for shop element")
	public void i_wait_for_seconds_for_shop_element(int arg1) throws InterruptedException {
	    Thread.sleep(arg1 * 1000);
	}

	@When("I click on home element")
	public void i_click_on_home_element() {
	   driver.findElement(By.xpath("//*[@id=\"content\"]/nav/a")).click();
	}

	@When("I wait for {int} seconds for home element")
	public void i_wait_for_seconds_for_home_element(int arg1 ) throws InterruptedException {
	   Thread.sleep(arg1 * 1000);
	}
	@Then("close the driver")
	public void close_the_driver() {
	   driver.close();
	}
}
