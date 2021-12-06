package tests;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import tests.Reporter1;

public class Test1 {
	ExtentTest test1;
	@Test
	public void test1() {
		try {
		System.out.println("I am inside Test1 ");
		Reporter1 extentReport = new Reporter1();
		test1 = extentReport.extent.createTest("This is my first test");
		
		}catch(Exception exp) {
			test1.fail(exp.getMessage());
			test1.error(exp.getCause());
			exp.printStackTrace();
		}finally {
			test1.info("completed");
		}
		
	}
	
		
		
		
		
		
		
		
		
	@Test
	public void test2() {
		System.out.println("I am inside Test2");
		Reporter1 extentReport = new Reporter1();
		extentReport.extent.createTest("This is my second test");
	}

}
