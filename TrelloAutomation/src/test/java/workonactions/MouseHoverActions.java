package workonactions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseHoverActions {
	@Test
	public void MouseHoverActions() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.myntra.com/");
		WebElement men = driver.findElement(By.xpath("//a[@data-group='men']"));
		WebElement women = driver.findElement(By.xpath("//a[@data-group='women']"));
		Actions as=new Actions(driver);
		as.moveToElement(men).perform();
		as.moveToElement(women).perform();
		as.contextClick(men).perform();
		
	}

}
