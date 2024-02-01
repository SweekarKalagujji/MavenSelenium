package pageobjectmodel.testcases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import pageobjectmodel.pages.LoginPage;
import pageobjectmodel.pages.NewLoginPage;

public class BaseClass  {

	public WebDriver driver;
	public NewLoginPage np;
    public LoginPage lp;
	@BeforeClass
	public void start() {
		
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		np= PageFactory.initElements(driver,NewLoginPage.class);
		lp= new LoginPage(driver);
		
	

	

}
	
@AfterClass
public void end() {
	driver.quit();
}
}
