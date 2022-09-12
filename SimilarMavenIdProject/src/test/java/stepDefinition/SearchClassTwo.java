package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchClassTwo{
	ChromeDriver driver;
	@Given("I am on google page {string}")
	public void i_am_on_google_page(String string) {
	  System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get(string);
	}

	@When("I search = {string}")
	public void i_search(String string) {
	   driver.findElement(By.name("q")).sendKeys(string);
	  
	}

	@When("I click on google search button")
	public void i_click_on_google_search_button() {
	    driver.findElement (By.name("btnK")).submit();
	    
	}

	@Then("click on first link")
	public void click_on_first_link() {
	    driver.findElement (By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div[1]/div/a/h3"));
	   driver.close();
	}

}

