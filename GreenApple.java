import java.text.DecimalFormat;
import java.util.Scanner;


public class GreenApple extends Apple {
	private static DecimalFormat df2 = new DecimalFormat("#.##"); 
	Scanner input = new Scanner(System.in);
	
	private String colour;
	private String taste;
	double balance;
	
	public GreenApple(String name, double p, String c, String t) {
		super(name, p);
		colour = c;
		taste = t;

		
	}
		
		public String getColour() {
			return colour;
		}
		
		public String getTaste() {
			return taste;
		
		}
		
		public double calBalance() {
			System.out.print("Please enter your payment : RM ");
			double pt = input.nextDouble();
			
			return balance = pt - totalprice;
		}
		
		public String orderDetails() {
			return "\n=========Order details==========" +
					"\n" + Name() +
					"\nColour\t\t: " + colour +
					"\nTaste\t\t: " + taste +
					"\nQuantity\t: " + quantity;
		}
		
		public String paymentDetails() {
			return "\n==========Payment==========" + 
					"\nTotal price\t: RM " + df2.format(totalprice) +
					"\nBalance\t\t: RM " + df2.format(calBalance());
		}

		public String toString() {
			return orderDetails() + "\n" + paymentDetails() +
					"\n==========THANK YOU==========";
		}
}
