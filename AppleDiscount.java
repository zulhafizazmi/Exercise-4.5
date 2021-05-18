class Applediscount implements Discount{
	
	public float rateOfDiscount() {
		return 0.15f;
	}
	
} 

class RedAppleDiscount implements Discount{

	public float rateOfDiscount() {
		return 0.25f;
	}
	
} 

class GreenAppleDiscount implements Discount{

	public float rateOfDiscount() {
		return 0.35f;
	}
	
} 

class BananaDiscount implements Discount{

	public float rateOfDiscount() {
		return 0.12f;
	}
	
} 


class PineappleDiscount implements Discount{

	public float rateOfDiscount() {
		return 0.18f;
	}
	
}