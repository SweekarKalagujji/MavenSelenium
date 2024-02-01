package pageobjectmodel.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageCrmTest extends BaseClassCrm
{
	
  @Test(priority=1)
  public void verifyLogin() 
  {
	  lpc.doLogin("test123@gmail.com","test@123");
	  Assert.assertTrue(driver.getCurrentUrl().contains("customers"),"Test fail!");
	  System.out.println("Test pass! "+driver.getCurrentUrl());
	
	  
  }
  
  @Test(priority=2)
  public void verifyUrl()
  {
	 Assert.assertTrue(lpc.getUrl().contains("customers"),"Fail: Url isn't valid!!");
	 System.out.println("Url is valid!!");
  }
  
  @Test(priority=3)
  public void verifyTitle() 
  {
	 Assert.assertTrue(lpc.getAppTitle().contains("Customers"),"Fail:Title isn't matched!");
	 System.out.println("Title is matched!!");
  }
}
  
