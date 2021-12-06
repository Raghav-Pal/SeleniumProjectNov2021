import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mouse {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		/*
		driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");
		WebElement boxA = driver.findElement(By.xpath("//li[text()='A']"));
		WebElement boxC = driver.findElement(By.xpath("//li[text()='C']"));
		WebElement boxD = driver.findElement(By.xpath("//li[text()='D']"));
		
		Actions action = new Actions(driver);
		action.moveToElement(boxA);
		action.clickAndHold();
		//action.release();
		action.moveToElement(boxC);
		//action.release();
		//action.contextClick(boxD);
		//action.doubleClick(boxD);
		action.build().perform();
		*/
		
		driver.get("https://selenium08.blogspot.com/2020/01/drag-drop.html");
		WebElement element1 = driver.findElement(By.id("draggable"));
		WebElement element2 = driver.findElement(By.id("droppable"));
		
		Actions action = new Actions(driver);
		action.dragAndDrop(element1, element2);
		action.build().perform();
	}
	
}
