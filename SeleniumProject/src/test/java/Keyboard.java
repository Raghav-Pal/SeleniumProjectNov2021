import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Keyboard {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	/*
		driver.get("https://google.com");
		//send keys
		driver.findElement(By.name("q")).sendKeys("Selenium" +Keys.ENTER);
		
		//key down
		Actions actions = new Actions(driver);
		actions.keyDown(Keys.CONTROL).sendKeys("a").build().perform();
		Thread.sleep(1000);
		driver.findElement(By.name("q")).sendKeys("Selenium" +Keys.ENTER);
		*/
		//key up
		driver.get("https://google.com");
		WebElement search = driver.findElement(By.name("q"));
		Actions action = new Actions(driver);
		
		action.keyDown(Keys.SHIFT).sendKeys(search, "selenium").build().perform();
		
		action.keyUp(Keys.SHIFT).build().perform();
		Thread.sleep(1000);
		//search.sendKeys("selenium");
		driver.findElement(By.name("q")).sendKeys("Selenium");
		//.keyUp(Keys.SHIFT).sendKeys(search, " selenium").build().perform();
		driver.findElement(By.name("q")).clear();
		Thread.sleep(3000);
		driver.quit();
	}

}
