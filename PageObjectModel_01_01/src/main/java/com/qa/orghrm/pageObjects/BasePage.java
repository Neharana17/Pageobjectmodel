package com.qa.orghrm.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {

		 WebDriver driver;
		
		public BasePage(WebDriver driver) {

			this.driver=driver;
			
			
	}
		public WebElement getElement(By locator) {
			
			WebElement elm=driver.findElement(locator);
			return elm;
		
			
		}
		public static void getElement() {
			
			
		}
		
		}
		
		
	

	
	


