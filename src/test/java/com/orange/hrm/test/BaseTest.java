package com.orange.hrm.test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

import com.report.ExtentReportUtils;

public class BaseTest {//parent class for LoginTest class and HomePageTest class
	
	//make static so it is available to all classes
	public static WebDriver driver;
	
	@BeforeSuite //call this first from testNG.xml
	public void initDriver() {
		
		ExtentReportUtils.setUpReport();
		//create new ChromeDriver object
		driver = new ChromeDriver();
		//set implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//maximize window
		driver.manage().window().maximize();
		//launch webpage
		System.out.println("Inside initDriver method in the BaseTest class");
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		System.out.println("launch OrangeHRM Page");
	}
	

}
