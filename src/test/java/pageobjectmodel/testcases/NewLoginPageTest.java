package pageobjectmodel.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageobjectmodel.pages.NewLoginPage;

public class NewLoginPageTest extends BaseClass {
	
  @Test(priority=1)
  public void f() {
	 np.login1("Admin","admin123");
	  
  }
  @Test(priority=2)
  public void VerifyUrl() {
	  System.out.println(np.url());
  }
}
