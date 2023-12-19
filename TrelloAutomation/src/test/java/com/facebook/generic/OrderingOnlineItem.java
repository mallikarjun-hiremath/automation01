package com.facebook.generic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class OrderingOnlineItem {
	@Test
	public void onlineDemo() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.flipkart.com/");
		Actions as=new Actions(driver);
		WebElement closebutton = driver.findElement(By.tagName("//button[text()='✕']"));
		as.click(closebutton).perform();
		WebElement d = driver.findElement(By.name("q"));
		as.sendKeys(d, "mobile"+Keys.ENTER).perform();
		WebElement e = driver.findElement(By.xpath("//span[text()='OnePlus 11R 5G (Galactic Silver, 256 GB)']"));
		as.click(e).perform();
		
	}

}
