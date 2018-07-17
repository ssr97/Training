
/**
 * @author Nexwave
 *
 */

public class Welcome {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello world");
		int nums [] = new int[5];
		double prices[] = {10, 15, 8, 9, 7};
		
		for (int i = 10; i > 0; i--) {
			for (int j = 1; j <= i; j++)
				System.out.print(i);
			System.out.println();
		}
		int sum=0;
		for(int i = 1; i<6; i++) {
//			sum+=5;
			System.out.println('*');
		}
		int dig = 0;
		for (int i = 0; i < 6; i++) {
			dig += i;
			System.out.println(dig);
		}
		
		for(int i=1; i<11; i++) {
			System.out.println(i + " x 5 = "+ (i*5));
		}
		
		int a = 5;
		int b = 2;
		
		for (int i = 0; i< (a+b); i++)
			System.out.println("Shaurya");
		
		int speed = 689232;
		long distance = speed *5;
		System.out.println(distance);
		double tax = 0.2;
		double bonus = 0.15;
		double utilty = 0.15;
		double expenditure = 0.5;
		double sal = 55555.55;
		
		double savings = sal - (sal*tax + sal*utilty + sal*expenditure) + sal*bonus;
		System.out.println("Total savings = "+ savings);
		
		int amt = 5000;
		int mobileCost = 650;
		int numberOfMobiles = 5;
		amt = amt%(mobileCost*numberOfMobiles);
		System.out.println("Amt left = "+ amt);
		
		int arr[] = {77, 65, 78, 71, 79};
		String fruit="";
		for(int i=0; i<arr.length; i++)
			fruit+=(char)arr[i];
		System.out.println("Name of the fruit is "+fruit);
		
		for(int i =10; i<=20; i++) {
			System.out.print((char)i);
		}
		
		Mobile mobile = new Mobile();
		mobile.brandName = "SAMSUNG";
		mobile.color = "Black";
		mobile.price = 25000;
		mobile.resolution = 16;
		
		System.out.println("Discount is "+mobile.getDiscount());
		char ch = 'x';
		if(ch == 'x')
			System.out.println("EQUAL");
		
	}

}
