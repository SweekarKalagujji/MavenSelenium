package pageobjectmodel.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageCrm
{
	private WebDriver driver;
	
	public LoginPageCrm(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//locators 
	By username= By.id("email-id");
	By password=By.id("password");
	By checkbox=By.id("remember");
	By submit=By.id("submit-id");
	
	
	//Methods
	public void doLogin(String un,String psw) 
	{
	driver.findElement(username).sendKeys(un);
	driver.findElement(password).sendKeys(psw);
	driver.findElement(checkbox).click();
	driver.findElement(submit).click();
	}
	
	public String getUrl()
	{
		return driver.getCurrentUrl();
	}
	public String getAppTitle()
	{
		return driver.getTitle();
	}
}
