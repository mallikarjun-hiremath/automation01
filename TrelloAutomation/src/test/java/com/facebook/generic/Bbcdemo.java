package com.facebook.generic;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bbcdemo {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bbc.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		List<WebElement> bbcsugg = driver.findElements(By.xpath("(//a[@class='top-list-item__link']/../..)[1]"));
		for (WebElement news : bbcsugg) {
			String text = news.getText();
			System.out.println(text);
			
		}
		driver.quit();
		
	}

}
