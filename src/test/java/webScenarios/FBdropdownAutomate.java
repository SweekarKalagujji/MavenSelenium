package webScenarios;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FBdropdownAutomate {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		WebElement l=driver.findElement(By.xpath("//select[@id='day']"));
		Select dd1=new Select(l);
		dd1.selectByIndex(29);
		
		WebElement l1=driver.findElement(By.xpath("//select[@id='month']"));
		Select dd=new Select(l1);
		dd.selectByVisibleText("Aug");
		
		WebElement l2=driver.findElement(By.xpath("//select[@id='year']"));
		Select f=new Select(l2);
		f.selectByValue("1999");
		
		List<WebElement>we=f.getOptions();
		for(WebElement i:we) {
			System.out.println(i.getText());
			
		}
		
		
		
		
		
		
				
		
		

	}

}
