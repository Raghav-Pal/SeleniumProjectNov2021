package abstractdemo;

public abstract class Car {
	
	String name;
	String color;
	int model;
	
	void startEngine() {
		System.out.println("Starting engine for "+name);
	}
	
	abstract void topSpeed();

}
