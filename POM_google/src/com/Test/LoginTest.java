package com.Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.BaseTest.BaseTestGoogle;
import com.Pages.LoginPage;

public class LoginTest  extends BaseTestGoogle{
	
LoginPage per;

@Test
public void logintest() {
	per=PageFactory.initElements(driver, LoginPage.class);
	per.logIN();
	
}
}
