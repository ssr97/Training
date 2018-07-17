class Cot{
	double price;
}

class Chair
{
	double price;
}

class DiningTable
{
	double price;
}



class Furniture {
public double calculateDiscount(Chair ch)
{
	return ch.price*0.2;
}
public double calculateDiscount(DiningTable dt)
{
	return dt.price*0.15;
}
public double calculateDiscount(Cot c)
{
	return c.price*0.3;
}

}

public class TestOverloading{
	public static void main(String[] args)
	{
		Chair ch = new Chair();
		ch.price = 1800;
		double disc = new Furniture().calculateDiscount(ch);
		System.out.println("Discount is "+ disc);
	}
	
}