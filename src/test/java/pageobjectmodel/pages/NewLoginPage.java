package pageobjectmodel.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewLoginPage {
	private WebDriver driver;
	
	public NewLoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	@FindBy(name="username")
	WebElement un;
	@FindBy(name="password")
	WebElement psw;
	@FindBy(xpath="//button[@type='submit']")
	WebElement btn;
	
	
	public void login1(String name ,String password) {
		
		un.sendKeys(name);
		psw.sendKeys(password);
		btn.click();
		
	}
	public String url() {
		return driver.getCurrentUrl();
	}
	public String title1() {
		return driver.getTitle();
		
	}
	

}
