package com.hrms.pages;

import org.openqa.selenium.By;
import org.testng.Reporter;
import com.hrms.utility.BaseClass;

public class LogoutPage extends BaseClass{
//--------Object / Elements
static By link_logout = By.linkText("Logout");	
//--------Fuction / Methods
public static void logout() {
driver.findElement(link_logout).click();
Reporter.log("Logout completed");
}
}
