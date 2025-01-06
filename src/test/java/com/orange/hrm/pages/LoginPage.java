package com.orange.hrm.pages;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orange.hrm.test.BaseTest;
import com.report.ExtentReportUtils;

public class LoginPage {
	
			// create username locator by using @FindBy annotation
			@FindBy(name = "username")
			WebElement userNameTextBox;
			
			// create password locator by using @FindBy annotation
			@FindBy(name = "password")
			WebElement passwordTextBox;

			// click login button
			@FindBy(xpath = "//button[@type='submit']")
			WebElement loginBtn;
			
			//create constructor of the LoginPage and call initElements method to initialize all the elements of this class
			public LoginPage() {
				//use "this" keyword to initialize all the objects of "LoginPage"
				System.out.println("Inside LoginPage method in the LoginPage class and Initialize all the objects of LoginPage");
				PageFactory.initElements(BaseTest.driver, this);
			}
			
			//adding logging with log4j. create logger object
			Logger log = LogManager.getLogger(LoginPage.class);
			//now we write the methods to perform the tasks on these locators
			//method to automate the login steps
			public void loginToApplication(String userName, String password){
				
				System.out.println("Inside loginToApplication method in the LoginPage class");
				//first enter the username
				System.out.println("enter username");
				userNameTextBox.sendKeys(userName);
				//enter this step into the Extent report
				ExtentReportUtils.addStep("Username is entered");
				//write log message
				log.info("Username entered in the username text box");
				//enter password
				System.out.println("enter password");
				passwordTextBox.sendKeys(password);
				//enter this step into the Extent report
				ExtentReportUtils.addStep("Password value is entered in Password text box");
				//write log message
				log.info("password entered in the password text box");
				//click login
				System.out.println("click login");
				loginBtn.click();
				//write log message
				log.info("login button clicked");
				//enter this step into the Extent report
				ExtentReportUtils.addStep("Login button clicked");
				System.out.println("end of the com.orange.hrm.test.HomePageTest");
				System.out.println("===========================================");
				
			}
}
