package actionsandrobotclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/upload");
		String path="C:\\Users\\sweek\\Desktop\\Selenium StarAgile\\Upload.txt";
		
		driver.findElement(By.id("file-upload")).sendKeys(path);
		driver.findElement(By.id("file-submit"));
		
		

	}

}
