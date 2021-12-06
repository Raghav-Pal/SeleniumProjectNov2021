package abstractdemo;

public class BankOfAmerica extends Bank{
	
	double rateOfInterest;

	@Override
	double getRateOfInterest() {
		System.out.println("Rate of interest for "+name+" is "+rateOfInterest);
		return rateOfInterest;
	}

}
