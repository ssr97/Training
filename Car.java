
public class Car {
	String carName;
	double mileage, price;
	boolean luxuryType;
	
	public void setCarDetails(String carName, double mileage, double price, boolean luxuryType)
	{
		this.carName = carName;
		this.mileage = mileage;
		this.price = price;
		this.luxuryType = luxuryType;
	}
	
	public void printDetails()
	{
		System.out.println("Name of the car is "+ carName+ "\nMileage is "+mileage+"\nIt costs "+ price+"\n");
		if(luxuryType)
			System.out.println("This is a luxury car");
		else
			System.out.println("This is not a luxury car");
	}
	

}
