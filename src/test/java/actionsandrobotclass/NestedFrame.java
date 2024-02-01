package actionsandrobotclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrame {

	public static void main(String[] args) {


		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		
		//top
		driver.switchTo().frame("frame-top");
		driver.switchTo().frame("frame-left");
	String e=	driver.findElement(By.xpath("//body[normalize-space()='LEFT']")).getText();
	System.out.println(e);
		System.out.println("Left Page source");
		System.out.println(driver.getPageSource());
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0).switchTo().frame("frame-middle");
		System.out.println("Middle Page source");
		System.out.println(driver.getPageSource());
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		System.out.println(driver.getPageSource());
		
		
		

	}

}
