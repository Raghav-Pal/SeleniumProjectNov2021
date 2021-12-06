package tests;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportsDemo {

	public static void main(String[] args) throws IOException {

		// start reporters
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent_report1.html");
		// create ExtentReports and attach reporter(s)
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		// creates a toggle for the given test, adds all log events under it    
		ExtentTest test1 = extent.createTest("MyFirstTest", "Sample description for 1st test");
		// log(Status, details)
		test1.log(Status.INFO, "This step shows usage of log(status, details)");
		// info(details)
		test1.info("This step shows usage of info(details)");
		// log with snapshot
		test1.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
		// test with snapshot
		test1.addScreenCaptureFromPath("screenshot.png");
		// calling flush writes everything to the log file
		
		ExtentTest test2 = extent.createTest("MySecondTest", "Sample description for 2nd test");
		test2.log(Status.INFO, "This step shows usage of log(status, details)");
		test2.info("This step shows usage of info(details)");
		test2.pass("sample description");
		
		extent.flush();
		System.out.println("-- DONE --");
	}
}
