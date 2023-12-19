package com.facebook.generic;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ClosingWindowsUsingCloseMethod {
	@Test
	public void closingWindowsWithoutUsingQuit() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://secure.indeed.com/");
		Thread.sleep(3000);
		driver.findElement(By.id("apple-signin-button")).click();
		Set<String> allwd = driver.getWindowHandles();
		for (String wd : allwd) {
			driver.switchTo().window(wd);
			Thread.sleep(3000);
			driver.close();
			
			
		}
		
	}

}
