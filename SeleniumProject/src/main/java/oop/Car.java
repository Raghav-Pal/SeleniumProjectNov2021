package oop;

public class Car {
	
	String name;
	int model;
	String color;
	
	public void getCarDetails() {
		System.out.println("Name of Car : "+name+
				"\nModel : "+model+
				"\nColor : "+color);
	}

	public static void main(String[] args) {
		
		Car toyota = new Car();
		toyota.name = "Toyota";
		toyota.model = 2020;
		toyota.color = "Red";
		toyota.getCarDetails();
	}
}
