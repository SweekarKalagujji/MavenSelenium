package actionsandrobotclass;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
      WebElement s=  driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
        Actions ad= new Actions(driver);
        ad.doubleClick(s).perform();
        
        
        //Alert
        Alert af= driver.switchTo().alert();
       System.out.println(af.getText());
        af.accept();
        
        
        
	}

}
