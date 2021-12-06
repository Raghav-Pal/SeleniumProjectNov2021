package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.GoogleSearchPage;

public class GoogleSearchTest {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://google.com/");
		
		GoogleSearchPage searchPage = new GoogleSearchPage();
		searchPage.searchText(driver).sendKeys("Selenium");
		searchPage.searchButton(driver).click();
		
//		driver.findElement(By.name("q")).sendKeys("Selenium");
//		driver.findElement(By.name("btnK")).click();
		
		driver.close();
	}
}
