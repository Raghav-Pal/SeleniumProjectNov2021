package demo;

import org.testng.annotations.Test;

public class TestNGDependencyDemo {
	
	@Test(dependsOnMethods = "test2" )
	public void test1() {
		System.out.println(" inside Test1");
	}
	
	@Test
	public void test2() {
		System.out.println(" inside Test2");
	}
	
	@Test(dependsOnMethods = "test2")
	public void test3() {
		System.out.println(" inside Test3");
	}
	
	@Test
	public void test4() {
		System.out.println(" inside Test4");
	}
}
