package abstractdemo;

public class GermanBank extends Bank{
	
	double rateOfInterest;

	@Override
	double getRateOfInterest() {
		System.out.println("Rate of interest for "+name+" is "+rateOfInterest);
		return rateOfInterest;
	}

}
