package com.orange.hrm.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orange.hrm.test.BaseTest;
import com.report.ExtentReportUtils;

public class HomePage {

	// create admin link locator by using @FindBy annotation
	@FindBy(xpath = "//span[text()='Admin']")
	WebElement adminLink;

	// create profile pic link locator by using @FindBy annotation
	@FindBy(xpath = "//img[@alt='profile picture']")
	WebElement profilePicture;
	
	// create logout link locator by using @FindBy annotation
	@FindBy(linkText = "Logout")
	WebElement logoutLink;

	// create constructor of the HomePage and call initElements method to initialize
	// all the elements of this class
	public HomePage() {
		// use "this" keyword to initialize all the objects of "HomePage" class above
		System.out.println("Inside the HomePage method in the HomePage class and initialize the objects");
		PageFactory.initElements(BaseTest.driver, this);
	}

	//create object of logger
	Logger log = LogManager.getLogger(HomePage.class);
	
	// create the methods to perform the operations on the above elements
	public void clickOnAdminLink() {
		System.out.println("Inside the clickOnAdminLink method in the HomePage class");
		// click on "Admin" tab
		System.out.println("click Admin link");
		adminLink.click();
		//enter this step into the Extent report
		ExtentReportUtils.addStep("Admin link clicked");
		//write log message
		log.info("Admin link clicked");
	}

	public void logoutFromApplication() {
		System.out.println("Inside the logoutFromApplication method in the HomePage class");
		// click on the profile picture
		profilePicture.click();
		System.out.println("click on profile picture");
		
		//write log message
		log.info("Profile picture link clicked");
		// click on logout link
		System.out.println("click on logout link");
		logoutLink.click();
		//enter this step into the Extent report
		ExtentReportUtils.addStep("logout link clicked");
		//write log message
		log.info("logout link clicked");
		System.out.println("end of the com.orange.hrm.test.LoginTest");
		System.out.println("========================================");
	}

}
