package tests;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Reporter1 {
	
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	ExtentTest test1;
	
	
	public void reporter() {
		htmlReporter = new ExtentHtmlReporter("extent_report1.html");
		// create ExtentReports and attach reporter(s)
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		
		//ExtentTest test1 = extent.createTest("Orange HRM Login Test", "Test to check login functionality");
		
	}

}
