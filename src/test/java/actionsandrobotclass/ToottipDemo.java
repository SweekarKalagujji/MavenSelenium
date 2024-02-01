package actionsandrobotclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToottipDemo {

	public static void main(String[] args) {
	
		WebDriver driver= new ChromeDriver();
		driver.get("https://jqueryui.com/tooltip/");
		driver.switchTo().frame(0);
	WebElement f=	driver.findElement(By.id("age"));
		Actions a= new Actions(driver);
		a.moveToElement(f).perform();
		
		//tool tip
		
	String gy=	driver.findElement(By.xpath("//div[@class='ui-tooltip-content']")).getText();
	System.out.println(gy);
		
		
		

	}

}
