package pageobjectmodel.testcases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pageobjectmodel.pages.LoginPageCrm;

public class BaseClassCrm
{
 public WebDriver driver;
 public LoginPageCrm lpc;
 
 @BeforeClass
	public void start()
 {
		
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://automationplayground.com/crm/login.html");
		lpc= new LoginPageCrm(driver);
		
}
	
@AfterClass
public void end() {
	driver.quit();
}
}
