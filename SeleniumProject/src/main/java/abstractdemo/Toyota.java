package abstractdemo;

public class Toyota extends Car{
	
	int topSpeed;

	@Override
	void topSpeed() {
		System.out.println("Topspeed for "+name+" is "+topSpeed);
	}

	public static void main(String[] args) {
		
		Toyota toyota = new Toyota();
		toyota.name = "Toyota";
		toyota.color = "Grey";
		toyota.model = 2021;
		toyota.topSpeed = 500;
		toyota.startEngine();
		toyota.topSpeed();
	}
}
