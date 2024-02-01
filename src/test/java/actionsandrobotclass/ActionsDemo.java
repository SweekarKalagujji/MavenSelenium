package actionsandrobotclass;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	WebElement ele=	driver.findElement(By.xpath("//span[text()='right click me']"));
	Actions a = new Actions(driver);
    a.contextClick(ele).perform();
   List<WebElement>l= driver.findElements(By.xpath("//ul//li//span"));
   for(WebElement f:l) {
	   f.getText();
	   if(f.getText().contains("Delete")) {
		   f.click();
		   break;
	   }
   }
    Alert as= driver.switchTo().alert();
    as.accept();
		
		

	}

}
