package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchPage {
	
	static WebElement element;
	
	public static WebElement searchText(WebDriver driver) {
		element = driver.findElement(By.name("q"));
		return element;
	}
	
	public static WebElement searchButton(WebDriver driver) {
		element = driver.findElement(By.name("btnK"));
		return element;
	}
}
