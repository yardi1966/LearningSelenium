package com.test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OrangeHRMTest {

	RemoteWebDriver driver;
	@SuppressWarnings("deprecation")
	@Test(priority = 1)
	
	public void login() throws InterruptedException, MalformedURLException {
		
		ChromeOptions browserOptions = new ChromeOptions();
		browserOptions.setPlatformName("Windows 11");
		browserOptions.setBrowserVersion("latest");
		Map<String, Object> sauceOptions = new HashMap<>();
		sauceOptions.put("username", "oauth-anchjoma-7a038");
		sauceOptions.put("accessKey", "f05f17c8-07e4-43c9-8080-d69f21e92685");
		sauceOptions.put("build", "selenium-build-H2DPD");
		sauceOptions.put("name", "Sanity OrangeHRM");
		browserOptions.setCapability("sauce:options", sauceOptions);

		// start the session
		@SuppressWarnings("deprecation")
		URL url = new URL("https://ondemand.us-west-1.saucelabs.com:443/wd/hub");
		driver = new RemoteWebDriver(url, browserOptions);

		// run commands and assertions
		//driver.get("https://saucedemo.com");
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();// launch in full screen mode
		String title = driver.getTitle();
		boolean titleIsCorrect = title.contains("OrangeHRM");
		String jobStatus = titleIsCorrect ? "passed" : "failed";

		// end the session
		driver.executeScript("sauce:job-result=" + jobStatus);
		//driver.quit();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("inside OrangeHRM Class");
		// launch chrome brower and go to orangehrmlive.com
		//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//driver.manage().window().maximize();// launch in full screen mode
		System.out.println("inside login method");
		System.out.println("Launching OrangeHRM.com");

		// enter username
		driver.findElement(By.name("username")).sendKeys("Admin"); // find username element by name enter "Admin" in
		System.out.println("entering username");															// username textbox
		//Thread.sleep(5000);

		// enter password
		driver.findElement(By.name("password")).sendKeys("admin123"); // find password element by name enter "admin123"
		System.out.println("entering password");																// in password textbox
		//Thread.sleep(5000);

		// click login button
		driver.findElement(By.xpath("//button[@type='submit']")).click();// find login button element by xpath and click
		System.out.println("clicking submit");
		//Thread.sleep(5000);

	}
	//verify admin page is displayed
	@Test(priority = 2)
	public void testAdmin() throws InterruptedException {
		System.out.println("inside test admin method");
		driver.findElement(By.xpath("//span[text()='Admin']")).click();
		System.out.println("clicking Admin Tab");
		Thread.sleep(5000);
		boolean isDisplayed = driver.findElement(By.xpath("//h5[text()='System Users']")).isDisplayed();
		Assert.assertTrue(isDisplayed);

	}
	//logout of OrangeHRM
	@Test(priority = 3)
	public void logout() throws InterruptedException {
		System.out.println("inside logout method");
		// find element and click on it to display logout option
		driver.findElement(By.xpath("//img[@alt='profile picture']")).click();
		Thread.sleep(5000);
		System.out.println("clicking profile pic");
		//click on logout
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("clicked logout");
		//driver.quit();
	}
	
}
