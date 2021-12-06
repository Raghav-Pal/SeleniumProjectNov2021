package tests;

public class Demo1 {

	static int x;
	static int y;
	
	public static void main(String[] args) {
		x=1;
		y=1;
		test2();
		x=2;
		y=2;
		test1();
		x=3;
		y=3;
	}

	public static int test1() {
		x = 0;
		System.out.println("I am inside test1");
		x = 10;
		return x;
	}

	public static int test2() {
		y = 0;
		System.out.println("I am inside test2");
		y = 10;
		return y;
	}

}
