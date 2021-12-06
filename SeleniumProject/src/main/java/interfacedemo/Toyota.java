package interfacedemo;

public class Toyota implements Car {

	@Override
	public void startEngine() {
		System.out.println("Engine starting for Toyota");
	}

	@Override
	public void stopEngine() {
		System.out.println("Engine stopping for Toyota");
	}

}
