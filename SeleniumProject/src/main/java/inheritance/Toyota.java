package inheritance;

public class Toyota extends Car {
	
	int topSpeed;
	
	void getTopSpeed() {
		System.out.println("Top speed of "+name+" is "+topSpeed);
	}
	
	public static void main(String[] args) {
		
		Toyota toyota =new Toyota();
		toyota.name = "Toyota";
		toyota.model = 2020;
		toyota.color = "White";
		toyota.topSpeed = 200;
		toyota.startEngine();
		toyota.accelerate();
		toyota.stopEngine();
		toyota.getTopSpeed();
	}

}
