package tests;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.OrangeHRMLoginPage;

public class OrangeHRMLoginTest {

	WebDriver driver=null;
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	@BeforeTest
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		htmlReporter = new ExtentHtmlReporter("extent_report2.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
	}

	@Test
	public void test() throws IOException {
		ExtentTest test1 = extent.createTest("Orange HRM Login Test", "Test to check login functionality");
		test1.info("Starting test");

		driver.get("https://opensource-demo.orangehrmlive.com/");
		test1.pass("successfully navigated to orange HRM login page");

		OrangeHRMLoginPage loginPage = new OrangeHRMLoginPage(driver);
		loginPage.setUsername("admin");
		test1.pass("added username");

		test1.info("Trying to add password");
		loginPage.setPassword("Admin");
		test1.pass("added password");

		loginPage.clickLogin();
		test1.pass("clicked on login button");

		//screenshot
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("./image3.png"));

		//test1.info("Check this screenshot", MediaEntityBuilder.createScreenCaptureFromPath("./screenshot1.png").build());
		test1.addScreenCaptureFromPath("./image3.png");
	}

	@AfterTest
	public void teardown() {
		driver.close();
		extent.flush();
	}
}
