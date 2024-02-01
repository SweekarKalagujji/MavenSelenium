package actionsandrobotclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/slider/");
		driver.switchTo().frame(0);
		WebElement o=driver.findElement(By.className("ui-slider-handle"));
		Actions a= new Actions(driver);
		a.clickAndHold(o).moveToElement(o, 200, 0).build().perform();
		

	}

}
