package com.qa.orghrm.pageTests;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;


import com.qa.orghrm.pageObjects.BasePage;
import com.qa.orghrm.pageObjects.LoginPage;
import static com.qa.orghrm.utility.ReadConfigProperties.*;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseTest {
	protected WebDriver driver;
	BasePage basePage;
	LoginPage loginPage;
	@BeforeClass
	public void browserLaunch() throws IOException  {
		String browserName=getConfigProp("browser");
		if( browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}else if( browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
				
	}
		
		//window Maximize
		driver.manage().window().maximize();
		//Application Launch
		driver.get(getConfigProp("appurl"));
		basePage=new BasePage(driver);
		loginPage =new LoginPage(driver);
		
	}
	
	}

	


