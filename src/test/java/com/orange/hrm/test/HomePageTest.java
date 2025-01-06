package com.orange.hrm.test;

import org.testng.annotations.Test;

import com.orange.hrm.pages.HomePage;

public class HomePageTest extends BaseTest { // testNG will check for an @Before methods in the test class or parent
												// class BaseTest

	@Test
	// test to logout from the application
	public void logout() {
		System.out.println("Inside the logout method in the HomePageTest class");
		// in order to logout we need to call logoutFromApplication method from the
		// HomePage class
		// so we need to create an object of the HomePage class
		HomePage homePage = new HomePage();
		// logout from application
		System.out.println("call logoutFromApplication from HomePage class");
		homePage.logoutFromApplication();

	}
	@Test 
	public void adminLink() {
		// click on admin tab
		System.out.println("inside adminLink method in the HomePageTest class");
		// so we need to create an object of the HomePage class
		HomePage homePage = new HomePage();
		System.out.println("call clickOnAdminLink from HomePage class");
		homePage.clickOnAdminLink();
		
	}
}
