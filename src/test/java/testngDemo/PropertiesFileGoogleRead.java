package testngDemo;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import helper.PropertiesUtil;

public class PropertiesFileGoogleRead {
  @Test
  public void readFile() throws IOException {
	  
	  PropertiesUtil p2 = new PropertiesUtil();
	  WebDriver driver = new ChromeDriver();
	  driver.get(p2.getData("url"));
	  Assert.assertTrue(driver.getTitle().contains(p2.getData("title")),"Fail");
	  System.out.println("pass");
	  driver.findElement(By.name(p2.getData("name"))).sendKeys(p2.getData("input"),Keys.ENTER);
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	 /* File f1= new File("./"+"//config.properties");
	  FileInputStream f= new FileInputStream(f1);
	  Properties p = new Properties();
	  p.load(f);
	  
	  System.out.println(p.getProperty("url"));
	  System.out.println(p.getProperty("title"));  */
	  
	  
	  
  }
}
