package actionsandrobotclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverDemo {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_onmouseover");
		driver.switchTo().frame("iframeResult");
	WebElement f=	driver.findElement(By.xpath("//img[@alt='Smiley']"));
		
	Actions f1= new Actions(driver);
	f1.moveToElement(f).perform();
	
	System.out.println("Image is dispalyed in big shape");
	
	
		

	}

}
