package interfacedemo;

public class BankOfAmerica implements Bank{

	double rateOfInterest=4.5;

	@Override
	public double getRateOfInterest() {
			System.out.println("ROI = "+rateOfInterest);
			return rateOfInterest;
	}
	
	public static void main(String[] args) {
		
		BankOfAmerica bank1 = new BankOfAmerica();
		bank1.getRateOfInterest();
	}
}
