import java.util.Scanner;
import java.text.DecimalFormat;

public class Apple extends Fruits{		
		
		private static DecimalFormat df2 = new DecimalFormat("#.##"); 
		Scanner input = new Scanner(System.in);
		
		
		protected int quantity;
		protected double price;
		protected double totalprice;
		protected double discount;
		
		public Apple(String name, double p) { 
			super(name); 
			price = p;
			
			System.out.print("Please enter the quantity of " + Name() + " you want to buy : ");
			quantity = input.nextInt();
			
			if(name.equals("Apple")) {
				Discount ad = new Applediscount(); 	
				System.out.println("Discount: " + ad.rateOfDiscount());
				discount = ad.rateOfDiscount();
			}
			else if (name.equals("Red Apple")){
				Discount rad = new RedAppleDiscount(); 	
				System.out.println("Discount: " + rad.rateOfDiscount());
				discount = rad.rateOfDiscount();
			} 
			else if(name.equals("Green Apple")) {
				Discount gad = new GreenAppleDiscount(); 	
				System.out.println("Discount: " + gad.rateOfDiscount() * 100 + "%");
				discount = gad.rateOfDiscount();
			}
			else {
				System.out.println("There is NO DISCOUNT in this order!");
			}
			
			if(quantity < 50) {
				totalPrice();   
				System.out.println(name);
				System.out.println("You had add " + quantity + " apple into your cart. \nTotal Price of " + quantity + " apple is RM " + df2.format(totalPrice()));
			} 
			else if(quantity >= 50 && quantity < 100) {
				double p2 = 2.99; 
				totalPrice(p2); 
				System.out.println(name);
				System.out.println("You had add " + quantity + " apple into your cart. \nTotal Price of " + quantity + " apple is RM " + df2.format(totalPrice(p2)));
			} 
			else {
				double p3 = 1.99; 
				totalPrice(p3,quantity);
				System.out.println(name);
				System.out.println("You had add " + quantity + " apple into your cart." +
								   "\nTotal Price of " + quantity + " apple is RM " + df2.format(totalPrice(p3,quantity)));
			}
			
		}
		
		public double rateOfDiscount() {
			if (quantity >= 10) {
				if (quantity >= 10 && quantity <= 50) {
					discount = 0;
				}
				if (quantity >= 50 && quantity <= 100) {
					discount = 0.2;
				}
				else {
					discount = 0.3;
				}
			}
			return discount;
		}
		
		public double totalPrice() {
			return totalprice = (price * quantity) * (1 - discount);
		}
			
		public double totalPrice(double p2) {
			return totalprice = (p2 * quantity) * (1 - discount);
		}
			
		public double totalPrice(double p3, double q) {
			return totalprice = ((p3 * q) * (1 - discount));
		}
		
}