package oop;

public class AccountHolder {
	
	public String firstName;
	String lastName;
	int age;
	double accountBalance;
	boolean eligibleForCreditCard;
	
	public void testEligibility() {
		if(age>25 && accountBalance >= 20000) {
			System.out.println(firstName+" is eligible for Credit Card");
		}
		else {
			System.out.println(firstName+" Not Eligible");
		}
	}

}
