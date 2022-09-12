package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class ThreeSliders {
	
WebDriver driver;

		@Given("I am on google search {string}")
		public void i_am_on_google_search(String string) {
			System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(string);
			driver.close();
		}
		
		@Given("Open autometiontesting website {string}")
		public void open_autometiontesting_website(String string) {
			System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(string); 
		}
		
		@Then("locate and click the first slider")
		public void locate_and_click_the_first_slider() {
		   driver.findElement(By.xpath("//*[@id=\"n2-ss-6-arrow-next\"]/img")).click();
		}
		
		@Then("locate and click the second slider")
		public void locate_and_click_the_second_slider() {
		  driver.findElement(By.xpath("//*[@id=\"n2-ss-6-arrow-next\"]/img")).click();
		}
		
		@Then("locate and click the third slider")
		public void locate_and_click_the_third_slider() {
		   driver.findElement(By.xpath("//*[@id=\"n2-ss-6-arrow-next\"]/img")).click();
		}
		
		@Then("wait for {int} seconds")
		public void wait_for_seconds(int arg1) throws InterruptedException {
		   Thread.sleep(arg1 * 1000);
		}
		
		@Then("close the website")
		public void close_the_website() {
		   driver.close();
		}
		
		}
