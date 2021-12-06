package demo;

import org.testng.annotations.Test;

@Test(groups="regression")
public class TestNGGroupingDemo {
	
	@Test(groups = {"sanity","smoke"})
	public void test1() {
		System.out.println(" I am inside Test1");
	}
	
	@Test(groups = "smoke")
	public void test2() {
		System.out.println(" I am inside Test2");
	}
	
	@Test(groups = "regression")
	public void test3() {
		System.out.println(" I am inside Test3");
	}

	@Test(groups = "windows.sanity")
	public void windowTest1() {
		System.out.println(" Test1 - To be executed on windows os");
	}
	
	@Test(groups = "windows.smoke")
	public void windowTest2() {
		System.out.println(" Test2 - To be executed on windows os");
	}
	
	@Test(groups = "linux.sanity")
	public void linuxTest1() {
		System.out.println(" Test1 - To be executed on linux os");
	}
	
	@Test(groups = "linux.smoke")
	public void linuxTest2() {
		System.out.println(" Test2 - To be executed on linux os");
	}
	
}
