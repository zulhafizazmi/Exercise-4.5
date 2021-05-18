import java.util.Scanner;
import java.text.DecimalFormat;


public class Banana extends Fruits{
	
	private static DecimalFormat df2 = new DecimalFormat("#.##"); 
	Scanner input = new Scanner(System.in);
	
	private double grams;
	private double calories;
	private double totalCal, price, disc;

	public Banana(String name, double g, double c, double p) {		
		super(name);	
		grams = g;
		calories = c;
		price = p;
		
		System.out.print("Please enter the grams of banana : ");
		grams = input.nextDouble();
		
		if(grams < 200) {
			calories();
			System.out.println(name);
			System.out.println("The banana is LESS THAN 200g. \nTotal Calories: " + df2.format(calories()) + " kcal");
		} 
		else if(grams > 200 && grams < 400) {
			g = 250;
			calories(g);
			System.out.println(name);
			System.out.println("The banana is LESS THAN 200g and MORE THAN 400g. \nTotal Calories: " + df2.format(calories(g)) + " kcal");
		} 
		else if(grams > 400){
			int q = 5;
			double gg = 450;
			calories(gg, q);
			System.out.println(name);
			System.out.println("The banana is MORE THAN 400g. \nTotal Calories: " + df2.format(calories(gg, q)) + " kcal");
		} 
		else {
			System.out.println("Invalid input. Please enter a valid number.");
		}
		
		Discount bd = new PineappleDiscount(); 
		System.out.println("Discount: " + bd.rateOfDiscount()); 
		disc = bd.rateOfDiscount();
	}
	
	public double calories() {
		return totalCal = calories * 100;
	}
	
	public double calories(double g) {
		return totalCal = calories * g;
	}
	
	public double calories(double gg, int q) {
		return totalCal = calories * gg * q;
	}
	
	public double totalPrice() {
		return (price * grams) * (1 - disc);
	}
	
	public String toString() {
		return "\n==========Calories==========" +
				"\nFruit name\t: " + Name() +
				"\nTotal Calories\t: " + totalCal +
				"\nTotal Price\t: RM " + df2.format(totalPrice()) +
				"\n==========THANK YOU==========";
	}
	
}