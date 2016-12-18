package scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest implements AutoConst {

	public WebDriver driver;
	
	@BeforeMethod
	public void preCondition() {
		driver = new FirefoxDriver();
		driver.get("http://demo.actitime.com");
	}
	
	@AfterMethod
	public void postCondition() {
		driver.close();
	}
}
