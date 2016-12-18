package scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import pom.LoginPage;

public class surya {

	@Test
	public void login() throws InterruptedException {
	
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demo.actitime.com");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		LoginPage l1 = new LoginPage(driver);
		l1.setUsername("admin");
		l1.setPassword("mager");
		l1.clickLogin();
		
		Thread.sleep(3000);
		
		l1.setUsername("admin");
		l1.setPassword("manager");
		l1.clickLogin();
	}
}
