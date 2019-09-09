package maven;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OrangeHRm {
WebDriver driver = null;
String url="http://127.0.0.1/orangehrm-4.0/symfony/web/index.php/auth/login";

Logger logger= Logger.getLogger(OrangeHRm.class);
@Test
public void test() {
	
	System.setProperty("webdriver.gecko.driver", "./DriverFiles/geckodriver.exe");
	driver=new FirefoxDriver();
	PropertyConfigurator.configure("log4j.properties");
	logger.info("browser opened successfull ");
	
	driver.get(url);
	
	logger.info("succesfulll opened application");

}

}
