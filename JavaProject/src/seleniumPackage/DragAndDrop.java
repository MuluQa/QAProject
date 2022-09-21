package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
		
		WebDriver browserObject = new ChromeDriver();
		
		browserObject.get("http://jqueryui.com/droppable/");
		
		browserObject.switchTo().frame(0);
		
		WebElement source = browserObject.findElement(By.xpath("//*[@id=\"draggable\"]/p"));
		
		WebElement target = browserObject.findElement(By.xpath("//*[@id=\"droppable\"]"));
		
		Thread.sleep(3000);
		
		Actions act = new Actions(browserObject);
		
		act.dragAndDrop(source, target).build().perform();
		
		Thread.sleep(3000);
		
		browserObject.close();
		

	}

}
