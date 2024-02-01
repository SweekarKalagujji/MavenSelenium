package actionsandrobotclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragnDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get(" https://jqueryui.com/droppable/#default");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
	WebElement d=	driver.findElement(By.xpath("//p[text()='Drag me to my target']"));
	WebElement g= driver.findElement(By.id("droppable"));
		Actions a = new Actions(driver);
		//a.clickAndHold(d).moveToElement(g).release().build().perform();
		Thread.sleep(2000);
		
	a.dragAndDrop(d, g).perform();
		System.out.println("Action completed!");
		
		//StaleElementReferenceException-while execution if the page is automatically refreshed or if ele isnt found in the Dom
		
		

	}

}
