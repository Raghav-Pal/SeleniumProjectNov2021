package demo;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.Assert;

public class ExceptionHandlingDemo {

	public static void main(String[] args){
		System.out.println(" I am inside main");
		
		test2();
		
		
		
		System.out.println(" ending main");
	}
	
	
	
	public static void test2() {
		try {
		System.out.println(" I am inside test2");
		Assert.assertTrue(1>2);
		System.out.println(" Completed");
		int i = 1/0;
		System.out.println(" I am here");
		}
		catch(ArithmeticException e1) {
			System.out.println("Found Arithmetic Exception - "+e1.getMessage());
		}
		catch(Exception e2) {
			System.out.println("Found some Exception - "+e2.getMessage());
		}
		
	}

	
	
	
	
	
	
	
	
	
	
	public static void test1() throws Exception{

		try {
			System.out.println(" I am inside test1");

			int age = 10;
			
			if(age<18) {  
	            //throw Arithmetic exception if not eligible to vote  
	            throw new ArithmeticException("Person is not eligible to vote");    
	        }  
	        else {  
	            System.out.println("Person is eligible to vote!!");  
	        }  

			int i = 1/0;
			System.out.println(" Completed");

		}catch(ArithmeticException exp) {
			System.out.println(" found some arithmethic exception");
			System.out.println(" Message : "+exp.getMessage());
			System.out.println(" Cause : "+exp.getCause());
			exp.printStackTrace();
		}catch(Exception exp3) {
			System.out.println(" found some exception");
		}
		finally {
			System.out.println(" I am inside finally ");
		}
	}

}
