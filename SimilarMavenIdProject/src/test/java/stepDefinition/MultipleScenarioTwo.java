package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class MultipleScenarioTwo {

	WebDriver driver;
	@Given("I am on Amazon website {string}")
	public void i_am_on_amazon_website(String string) {
	   System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
	   driver = new ChromeDriver();
	   driver.get(string);
	}

	@Then("click on All in element")
	public void click_on_all_in_element() {
	   driver.findElement(By.xpath("//*[@id=\"nav-hamburger-menu\"]/span")).click();
	}

	@Then("click on Best sellers element")
	public void click_on_best_sellers_element() {
	   driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[1]/li[2]/a")).click();
	}

	@Then("use waits for {int} seconds for Amazon")
	public void use_waits_for_seconds_for_amazon(int arg1) throws InterruptedException {
	  Thread.sleep(arg1 * 1000);
	 
	}

	@Given("I am on yahoo website {string}")
	public void i_am_on_yahoo_website(String string) {
		 System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
		   driver = new ChromeDriver();
		   driver.get(string);
	}

	@Then("use waits for {int} seconds for yahoo")
	public void use_waits_for_seconds_for_yahoo(int arg1) throws InterruptedException {
	Thread.sleep(arg1*1000 );
	
	}

	@Given("user is on cnn website {string}")
	public void user_is_on_cnn_website(String string) {
		 System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
		   driver = new ChromeDriver();
		   driver.get(string);
	}

	@Given("user waits for {int} seconds for cnn")
	public void user_waits_for_seconds_for_cnn(int arg1) throws InterruptedException {
		Thread.sleep(arg1*1000 );
	}

	@Then("click on US element")
	public void click_on_us_element() {
	   driver.findElement(By.name("us")).click();
	   driver.close();
	}
	

}
