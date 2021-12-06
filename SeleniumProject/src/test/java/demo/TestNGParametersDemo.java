package demo;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGParametersDemo {
	
	@Test
	@Parameters("mySubject")
	public void myFunc(@Optional("Automation") String subName) {
		
		System.out.println(" I am learning "+subName);
	}

}
