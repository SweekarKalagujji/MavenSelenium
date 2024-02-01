package actionsandrobotclass;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SAssignment3
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.com/");
		System.out.println("Title is: "+driver.getTitle());
		
		WebElement list=driver.findElement(By.name("url"));
     	Select dd = new Select(list);
     	System.out.println("Does dropdown support multiple options? "+dd.isMultiple());
     	
     	dd.selectByVisibleText("Baby");
     	Thread.sleep(2000);
     	
		List<WebElement>list1= dd.getOptions();
		System.out.println("Total options are: "+list1.size());
		for(WebElement i:list1) 
		{
			System.out.println(i.getText());
			if(i.getText().contains("Video Games"))
			{
			    i.click();
				break;  
			}
		}
	    driver.quit();
	}
}

