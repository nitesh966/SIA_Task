package com.hrms.testscript;

import org.testng.annotations.Test;
import com.google.common.base.Verify;
import com.hrms.pages.LoginPage;
import com.hrms.pages.LogoutPage;
import com.hrms.pages.VerifyPage;
import com.hrms.utility.BaseClass;

public class TC001 {
@Test
public static void tc001() {
// Test Steps
	BaseClass.OpenApplication();
	VerifyPage.verifyTitle("HRMS");
	LoginPage.login("sureshit", "sureshit");
	VerifyPage.verifyTitle("sureshIT");
	LogoutPage.logout();
	BaseClass.CloseApplication();
	
}
}
