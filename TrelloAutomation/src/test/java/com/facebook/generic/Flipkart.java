package com.facebook.generic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("redmi12"+Keys.ENTER);
		WebElement flipk = driver.findElement(By.xpath("//div[text()='REDMI 12 (Jade Black, 128 GB)']/../..//div[text()='₹9,999']"));
		String s = flipk.getText();
		System.out.println(s);
	}

}
