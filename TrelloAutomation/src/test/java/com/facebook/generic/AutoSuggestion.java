package com.facebook.generic;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.findElement(By.id("APjFqb")).sendKeys("selenium");
		driver.switchTo().activeElement().sendKeys("selenium");
		List<WebElement> autosugg = driver.findElements(By.xpath("//span[contains(.,'selenium')]"));
		for (WebElement sugg : autosugg) {
			String text = sugg.getText();
			System.out.println(text);
		}
		//driver.close();
	}

}
