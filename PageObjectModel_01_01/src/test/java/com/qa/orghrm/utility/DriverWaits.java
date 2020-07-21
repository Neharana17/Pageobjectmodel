package com.qa.orghrm.utility;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.qa.orghrm.pageObjects.BasePage;

public class DriverWaits {
	//implicit wait
	public static void getimpWaitTime(WebDriver driver,int timeUnitMins) throws IOException {
	driver.manage().timeouts().implicitlyWait(timeUnitMins, TimeUnit.MINUTES);
}

public void WebDriver() {
	
}
}

