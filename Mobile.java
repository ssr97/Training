
public class Mobile {
	String brandName;
	String color;
	double price;
	int resolution;
	
	public double getDiscount() {
		
		if(this.brandName.equals("SAMSUNG"))return this.price*0.1;
		else if(this.brandName.equals("SAMSUNG"))
			return this.price*0.15;
			return 0.0;
	}
}
