package actionsandrobotclass;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSEDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		JavascriptExecutor js= (JavascriptExecutor) driver;
	js.executeScript("alert('Hey I new alert')");
	Alert a= driver.switchTo().alert();
	a.accept();
	String h =js.executeScript("return document.title").toString();
	System.out.println(h);
	js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	Thread.sleep(2000);
	js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
	WebElement ele=driver.findElement(By.xpath("(//h2[@class='as-title-block-left'])[2]"));
	//System.out.println(ele.getText());
    js.executeScript("arguments[0].scrollIntoView();",ele);
	
	
	
	 
	
	
		
		
		
		
		
		

	}

}
