package com.facebook.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginToFacebook {

	@FindBy(id="username")
	private WebElement emailtxt;
	
	@FindBy(name="pwd")
	private WebElement pwdtxt;
	
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement loginbt;
	
	public LoginToFacebook(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	public  void setLogin(String un,String pw) {
		emailtxt.sendKeys(un);
		pwdtxt.sendKeys(pw);
		loginbt.click();
	}
	
}
