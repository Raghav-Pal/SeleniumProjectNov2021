package demo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.GoogleSearchPageObjects;

public class GoogleSearchPageTest3 {

	WebDriver driver;

	@BeforeTest
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Test
	public void test() {
		driver.get("https://google.com/");
		GoogleSearchPageObjects searchPage = new GoogleSearchPageObjects(driver);
		searchPage.setTextInTextbox("Selenium");
		searchPage.clickSearchButton();
	}

	@AfterTest
	public void teardown() {
		driver.close();
	}
}
