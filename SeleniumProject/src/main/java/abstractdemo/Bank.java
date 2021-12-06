package abstractdemo;

public abstract class Bank {
	
	String name;
	
	void openAccount() {
		System.out.println("Opening Account in "+name);
	}

	abstract double getRateOfInterest();
}
