package com.orange.hrm.test;

import java.io.IOException;
import java.util.Properties;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import com.orange.hrm.pages.LoginPage;
import com.utility.ExcelUtility;
import com.utility.PropertiesUtility;

public class LoginTest extends BaseTest {

	@Test
	// first test is valid username and valid password
	public void loginWithValidUserNameAndValidPassword() throws InvalidFormatException, IOException {
		System.out.println("Inside the loginWithValidUserNameAndValidPassword method in the LoginTest class");
		// create a reference of the LoginPage class so we can use the methods
		LoginPage loginPage = new LoginPage();
		// call method loginToApplication with username and password
		System.out.println("call method loginToApplication from the LoginPage class with username and password");
		//loginPage.loginToApplication(ExcelUtility.getTestData(1, 0), ExcelUtility.getTestData(1, 1)); //switched to reading from the properties file
		//pass the data key = username and value = password from the properties file
		loginPage.loginToApplication(PropertiesUtility.getData("username"),(PropertiesUtility.getData("password")));
		
	}

	 @Test
	public void loginWithValidUserNameAndInvalidPassword() throws InvalidFormatException, IOException {
		System.out.println("Inside the loginWithValidUserNameAndInvalidPassword method in the LoginTest class");
		// create a reference of the LoginPage class so we can use the methods
		LoginPage loginPage = new LoginPage();
		System.out.println("call method loginToApplication from the LoginPage class with username and password");
		loginPage.loginToApplication(ExcelUtility.getTestData(2, 0), ExcelUtility.getTestData(2, 1));
	}

	 @Test
	public void loginWithInvalidUserNameAndInvalidPassword() throws InvalidFormatException, IOException {
		System.out.println("Inside the loginWithInvalidUserNameAndInvalidPassword method in the LoginTest class"); 
		// create a reference of the LoginPage class so we can use the methods
		LoginPage loginPage = new LoginPage();
		System.out.println("call method loginToApplication from the LoginPage class with username and password");
		loginPage.loginToApplication(ExcelUtility.getTestData(3, 0), ExcelUtility.getTestData(3, 1));
	}

	 @Test
	public void loginWithInValidUserNameAndvalidPassword() throws InvalidFormatException, IOException {
		System.out.println("Inside the loginWithInValidUserNameAndvalidPassword method in the LoginTest class");
		// create a reference of the LoginPage class so we can use the methods
		LoginPage loginPage = new LoginPage();
		System.out.println("call method loginToApplication from the LoginPage class with username and password");
		loginPage.loginToApplication(ExcelUtility.getTestData(4, 0), ExcelUtility.getTestData(4, 1));
	}
}
