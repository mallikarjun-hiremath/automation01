package com.facebook.generic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basics {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement loginbutton = driver.findElement(By.xpath("//button[@name='login']"));
		Thread.sleep(3000);
		loginbutton.click();
		driver.quit();
	}

}
