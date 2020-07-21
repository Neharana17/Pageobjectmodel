package com.qa.orghrm.pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage  extends BasePage{
	//locators:
	private By loginUsername=(By.id("txtUsername"));
	private By loginPass=(By.id("txtPassword"));
	private By loginBtn=(By.id("btnLogin"));
	
	
	public LoginPage(WebDriver driver) {
		super(driver);
}
	
	//Encapsulation

	public WebElement getLoginUsername() {
	 return getElement(loginUsername);
	}

	public WebElement getLoginPass() {
		return getElement(loginPass);
	}
	

	public WebElement getLoginBtn() {
		return getElement(loginBtn);
	}
	

public HomePage doLogin(String username,String password) {
	getLoginUsername().sendKeys(username);
	getLoginPass().sendKeys(password);
	getLoginBtn().click();
	return new HomePage(driver);
}
}
