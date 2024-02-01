package webHandlingSolutions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import helper.Utility;

public class AlertDemo_Rediff {

	public static void main(String[] args) throws InterruptedException
	{

			WebDriver driver=new ChromeDriver();
			driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
			
			Utility.getScreenshot(driver);
			//username
			driver.findElement(By.id("login1")).sendKeys("Priyanka");
			
			//click on btn
			driver.findElement(By.name("proceed")).click();
			
//			Thread.sleep(2000);
//			Utility.getScreenshot(driver);
			
			//alert appears
			/*
			 * org.openqa.selenium.UnhandledAlertException: unexpected alert open: 
			 * {Alert text : Please enter your password}
			 * 
			 */
			
			Thread.sleep(2000);
			//Handling alert-Alert is interface
			
			Alert alt=driver.switchTo().alert();
			
			
			System.out.println("Alert text is: "+alt.getText());
			
			alt.accept();
			
			Utility.getScreenshot(driver);
			
			//password
			driver.findElement(By.id("password")).sendKeys("test123");
			
			
			
			
			
			

	}

}