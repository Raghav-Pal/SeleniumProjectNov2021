package demo;

import org.testng.annotations.Test;

public class TestNGPriorityDemo {
	
	@Test(priority = 1)
	public void testOne() {
		System.out.println(" I am inside test 1");
	}
	
	@Test
	public void testTwo() {
		System.out.println(" I am inside test 2");
	}
	
	@Test(priority = 1)
	public void testThree() {
		System.out.println(" I am inside test 3");
	}

}
