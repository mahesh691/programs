package com.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	@FindBy(id	 = "email")
	WebElement username;
	@FindBy(id	 = "pass")
	WebElement pwd;
	@FindBy(id	 = "u_0_a")
	WebElement login;
	public void logIN() {
		username.sendKeys("mahesh");
		pwd.sendKeys("mahesh");
		login.click();
		
	}
}
