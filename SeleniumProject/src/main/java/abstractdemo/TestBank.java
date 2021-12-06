package abstractdemo;

public class TestBank {
	
	public static void main(String[] args) {
		
		BankOfAmerica bank1 = new BankOfAmerica();
		GermanBank bank2 = new GermanBank();
		
		bank1.name = "Bank Of America";
		bank1.rateOfInterest = 4.0;
		bank1.openAccount();
		bank1.getRateOfInterest();
		
		
		bank2.name = "German Bank";
		bank2.rateOfInterest = 5.0;
		bank2.openAccount();
		bank2.getRateOfInterest();
		
		
	}

}
