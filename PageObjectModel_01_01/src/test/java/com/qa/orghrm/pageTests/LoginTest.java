package com.qa.orghrm.pageTests;

import static com.qa.orghrm.utility.ReadConfigProperties.getConfigProp;

import java.io.IOException;

import org.testng.Assert;

import org.testng.annotations.Test;

import com.qa.orghrm.pageObjects.HomePage;



public class LoginTest  extends BaseTest{
	@Test
	public void verifyLogin() throws Exception {
		String username=getConfigProp("adminusername");
		String password=getConfigProp("adminpwd");
		//step1: login to app
		HomePage hp=loginPage.doLogin(username,password);
		
	
	}
}
