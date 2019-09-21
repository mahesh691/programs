package com.BaseTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTestGoogle {
public  WebDriver driver =null;
String url="https://www.facebook.com/";
@BeforeMethod
public void setup() {
	System.setProperty("webdriver.gecko.driver", "./DriverFiles/geckodriver.exe");
	driver=new FirefoxDriver();
	driver.get(url);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}

@AfterMethod
public void close() {
	driver.close();
}
	
	
}
