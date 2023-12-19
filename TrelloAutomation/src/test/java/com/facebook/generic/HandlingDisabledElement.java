package com.facebook.generic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandlingDisabledElement {
	@Test
	public void HandlingDisabledElement() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://www.bbc.com/");
		JavascriptExecutor j=(JavascriptExecutor) driver;
		int abc = driver.findElement(By.xpath("//span[text()='Future Planet']")).getLocation().getY();
		j.executeScript("window.scrollBy(0,"+abc+")");
		
	}

}
