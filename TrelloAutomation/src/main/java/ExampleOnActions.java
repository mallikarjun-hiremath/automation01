import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ExampleOnActions {
	@Test
	public void actionsExample() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		WebElement grocery = driver.findElement(By.xpath("//div[text()='Grocery']"));
		Actions as=new Actions(driver);
		as.clickAndHold(grocery).release().build().perform();
		Thread.sleep(3000);
		
		as.doubleClick(grocery).perform();
		WebElement location = driver.findElement(By.xpath("//button[@class='_2KpZ6l _1IsWyb _3dESVI']"));
		as.click(location).perform();
	
	
		
		
		
	}

}
