package inheritance;

public class Dog extends Animal{
	
	public void eats() {
		super.eats();
		System.out.println(name+" likes to eat cookies");
	}
	public void sleeps() {
		System.out.println(name+" likes to sleep");
	}

}
