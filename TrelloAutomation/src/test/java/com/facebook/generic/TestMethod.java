package com.facebook.generic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestMethod {
	@Test
	public void verifyLogin() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		LoginToFacebook lf=new LoginToFacebook(driver);
		lf.setLogin("admin", "manager");
		driver.close();
		
	}

}
