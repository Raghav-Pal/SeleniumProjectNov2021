package oop;

public class FruitObjects {
	
	public static void main(String[] args) {
		
		Fruit apple = new Fruit();
		apple.setFruitName("Apple");
		apple.setFruitColor("Red");
		System.out.println(apple.fruitName);
		System.out.println(apple.fruitColor);
		
		Fruit banana = new Fruit();
		banana.setFruitName("Banana");
		banana.setFruitColor("Yellow");
		System.out.println(banana.fruitName);
		System.out.println(banana.fruitColor);
	}

}
