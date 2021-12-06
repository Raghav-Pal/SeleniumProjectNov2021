package demo;

import org.testng.annotations.Test;

public class TestNGRerunDemo2 {
	
	@Test
	public void test4() {
		System.out.println(" I am inside test4 ");
		int i = 1/0;
	}
	
	@Test
	public void test5() {
		System.out.println(" I am inside test5 ");
	}
	
	@Test
	public void test6() {
		System.out.println(" I am inside test6 ");
	}

}
