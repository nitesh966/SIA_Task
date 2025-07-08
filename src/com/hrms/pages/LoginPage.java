package com.hrms.pages;

import com.hrms.utility.BaseClass;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class LoginPage extends BaseClass {
//--------Objects / Elements
	
	static By txt_loginname = By.name("txtUserName");
	static By txt_Password = By.name("txtPassword");
	static By btn_login = By.name("Submit");

//--------Fuctions / Methods
	public static void login(String un, String pw) {
		driver.findElement(txt_loginname).sendKeys(un);
		driver.findElement(txt_Password).sendKeys(pw);
		driver.findElement(btn_login);
		Reporter.log("login completed");
	}
}
