package inheritance;

public class Car {
	
	String name;
	String color;
	int model;
	
	void startEngine() {
		System.out.println(name+ " Engine starting");
	}
	
	void accelerate() {
		System.out.println(name+ " Accelerating");
	}
	
	void stopEngine() {
		System.out.println(name+ " Engine Stopping");
	}

}
