package scripts;

import org.testng.annotations.Test;

import pom.LoginPage;

public class ValidLoginLogout extends BaseTest {

	@Test
	public void testValidLoginLogout () {
		LoginPage l1 = new LoginPage(driver);
		l1.setUsername("admin");
		l1.setPassword("manager");
		l1.clickLogin();
	}
}
