package pageobjectmodel.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage 
{

 private WebDriver driver;
 
 public LoginPage(WebDriver driver) {
	 this.driver=driver;
 }
private By un= By.name("username");
  private By psw= By.name("password");
private  By btn=By.xpath("//button[@type='submit']");


public void doLogin(String username,String password) {
	
	driver.findElement(un).sendKeys(username);
	driver.findElement(psw).sendKeys(password);
	driver.findElement(btn).click();
		
}

public String getUrl() {
	return driver.getCurrentUrl();
}
public String getAppTitle() {
	return driver.getTitle();
}
}
