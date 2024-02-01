package pageobjectmodel.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseClass {
  @Test(priority=1)
  public void verifyLogin() 
  {
	  lp.doLogin("Admin","admin123");
	  Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"),"Test fail!");
	  System.out.println("Test pass!"+driver.getCurrentUrl());
	  
  }
  @Test(priority=2)
  public void verifyUrl() {
	 Assert.assertTrue(lp.getUrl().contains("hrmlive"),"Faiil!!!!!111");
  }
  @Test(priority=3)
  public void verifyTitle() {
	 Assert.assertTrue(lp.getAppTitle().contains("OrangeHRM"),"Faiil!!!!!111");
  }
}
