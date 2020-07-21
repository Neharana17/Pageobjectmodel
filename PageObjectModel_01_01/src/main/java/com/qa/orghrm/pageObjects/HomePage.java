package com.qa.orghrm.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage  extends BasePage{
private By WelclmLink=By.id("Welcome");
private By logOutLink=By.linkText("Logout");

	
 public HomePage(WebDriver driver) {
		super(driver);
		
	}
	public WebElement getWelclmlink() {
	return getElement(WelclmLink);
}
	public WebElement getlogoutLink() {
		return getElement( logOutLink);
	}



	public void logout() {
		getWelclmlink().click();
		getlogoutLink().click();
		
	}
	
	}
	
	


