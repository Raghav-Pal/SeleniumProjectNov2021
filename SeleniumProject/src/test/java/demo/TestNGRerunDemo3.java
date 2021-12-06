package demo;

import org.testng.annotations.Test;

public class TestNGRerunDemo3 {
	
	@Test
	public void test7() {
		System.out.println(" I am inside test7 ");
	}
	
	@Test
	public void test8() {
		System.out.println(" I am inside test8 ");
		
	}
	
	@Test
	public void test9() {
		System.out.println(" I am inside test9 ");
		int i = 1/0;
	}

}
