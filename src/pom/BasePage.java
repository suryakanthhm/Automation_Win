package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class BasePage {
	
	public WebDriver driver;
	
	public BasePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	public void veirfyTitle(String eTitle)
	{
		String aTitle = driver.getTitle();
		Assert.assertEquals(aTitle, eTitle);
	}
}
