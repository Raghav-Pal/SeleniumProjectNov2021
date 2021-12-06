package demo;

import org.testng.annotations.Test;

public class TestNGGroupingDemo2 {
	
	@Test(groups = {"qa","sanity"})
	public void test1() { System.out.println(" Inside test1"); }
	
	@Test(groups = {"qa","staging"})
	public void test2() { System.out.println(" Inside test2"); }
	
	@Test(groups = {"staging","prod","sanity"})
	public void test3() { System.out.println(" Inside test3"); }
	
	@Test(groups = {"staging"})
	public void test4() { System.out.println(" Inside test4"); }
	
	@Test(groups = {"prod"})
	public void test5() { System.out.println(" Inside test5"); }

}
