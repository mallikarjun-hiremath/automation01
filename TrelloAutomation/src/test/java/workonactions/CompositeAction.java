package workonactions;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class CompositeAction {
	@Test
	public void compositeAction() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.myntra.com/");
		WebElement mn = driver.findElement(By.xpath("//a[@data-group='men']"));
		WebElement wmn = driver.findElement(By.xpath("//a[@data-group='women']"));
		WebElement kids = driver.findElement(By.xpath("//a[@data-group='kids']"));
		WebElement homeliving = driver.findElement(By.xpath("//a[@data-group='home-&-living']"));
		WebElement beauty = driver.findElement(By.xpath("//a[@data-group='beauty']"));
		WebElement studio = driver.findElement(By.xpath("//a[@data-group='studio']"));
		Actions as=new Actions(driver);
		as.moveToElement(mn).moveToElement(wmn).moveToElement(kids).moveToElement(homeliving).moveToElement(beauty).moveToElement(studio).build().perform();
		
		
		
		
	}
	
	

}
