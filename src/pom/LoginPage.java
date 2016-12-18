package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

   @FindBy(id="username")
	private WebElement username;
   
   @FindBy(name="pwd")
	private WebElement password;
   
   @FindBy(id="loginButton")
	private WebElement loginButton;
   
   public LoginPage(WebDriver driver) {
 		super(driver);
 	}
	
	public void setUsername(String un) {
		username.sendKeys(un);
	}
	
	public void setPassword(String pw) {
		password.sendKeys(pw);
	}
	
	public void clickLogin() {
		loginButton.click();
	}
}
