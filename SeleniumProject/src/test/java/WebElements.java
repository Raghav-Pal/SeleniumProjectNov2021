import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElements {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		/*
		// find element
		driver.get("https://google.com");
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("Selenium");
		*/
		/*
		// find elements
		driver.get("https://trytestingthis.netlify.app/");
		driver.findElement(By.cssSelector("#fname")).sendKeys("Selenium");
		
		List<WebElement> options =  driver.findElements(By.name("Optionwithcheck[]"));
		for(WebElement option : options) {
			System.out.println(option.getText());
		}
		*/
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		WebElement loginButton = driver.findElement(By.id("btnLogin"));
		
		WebElement passwordBox = driver.findElement(RelativeLocator.with(By.tagName("input")).above(loginButton));
		passwordBox.sendKeys("ABCD");
		
		Thread.sleep(4000);
		driver.quit();
	}

}
