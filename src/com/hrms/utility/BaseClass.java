package com.hrms.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;

public class BaseClass {
	//driver reference
	public static WebDriver driver;
	//Open Application
	public static void OpenApplication() {
		driver = new FirefoxDriver();
		driver.navigate().to("https://ctcorphyd.com/SureshIT/login.php");
		Reporter.log("Application Oppend");
	}
	//Close Application
	public static void CloseApplication() {
		driver.quit();
		Reporter.log("Close Application");
	}
}

