package com.facebook.generic;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementScreenshot {
	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		File screen = driver.findElement(By.xpath("//div[@class='atLogoImg']")).getScreenshotAs(OutputType.FILE);
	  String tempAddress = screen.getAbsolutePath();
	  System.out.println(tempAddress);
	  File perAddress=new File("./ScreenShot/actitime.png");
	  FileUtils.copyFile(screen, perAddress);
	  driver.close();
	   
		
		
	}

}
