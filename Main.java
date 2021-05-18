public class Main {

	public static void main(String[] args) {
		System.out.println("Welcome to Fruit Shop.");
		System.out.println();
		
		Apple obj1 = new Apple("Apple", 3.70);
		System.out.println(obj1);
		System.out.println();
		
		RedApple obj2 = new RedApple("Red Apple", 3.49, "Bright red", "Sweet");
		System.out.println(obj2);
		System.out.println();
		
		GreenApple obj3 = new GreenApple("Green Apple",  4.39, "Bright green", "Sour");
		System.out.println(obj3);
		System.out.println();
		
		Banana obj4 = new Banana("Banana", 200, 0.0732, 0.23);
		System.out.println(obj4);
		System.out.println();
		
		Pineapple obj5 = new Pineapple("Pineapple", 250, 2.35, 0.32);
		System.out.println(obj5);
		System.out.println();
	}

}