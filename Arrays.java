
public class Arrays {
	public static void main(String args[]) {
	int arr[] = {1 ,2 ,3, 4, 5};
	int flag = 0;
	
	//Prog1
	for(int i = 0; i< arr.length; i++)
		System.out.println(arr[i]);
	System.out.println("\nRev order\n");
	for(int i = arr.length - 1; i>=0; i--)
		{
			System.out.println(arr[i]);
			if(arr[i] == 26)
				flag = 1;
		}
	if (flag == 1)
		System.out.println("Found 26");
	else
		System.out.println("Couldnt find 26");
	
	
	//Prog2
	int max = arr[0];
	for (int i = 1; i<arr.length; i++) {
		if(arr[i]>max)
			max = arr[i];
	}
	
	System.out.println("max number is "+ max);
	
	//Prog3
	int min = arr[0];
	for (int i = 1; i<arr.length; i++) {
		if(arr[i]<min)
			min = arr[i];
	}
	
	System.out.println("min number is "+ min);
	
	//Prog4
	int sum = 0;
	for (int i = 0; i<arr.length; i++) {
		sum+=arr[i];
	}
	
	System.out.println("sum of the  numbers is "+ sum);
	
	//prog5
	int sumEven = 0;
	for (int i = 0; i<arr.length; i++) {
		if(arr[i]%2 == 0)
			sumEven+=arr[i];
	}
	
	System.out.println("sum of the even numbers is "+ sumEven);
	
	//Prog6
	String names[] = {"Vishal", "Sagar", "Shaurya", "GUru"};
	int pos = -1;
	for (int i = 0; i<names.length; i++) {
		if(names[i].equalsIgnoreCase("Guru"))
		{
			pos = i;
			break;
		}
	}
	if(pos!=-1)
		System.out.println("Guru found at position "+ (pos+1));
	else
		System.out.println("Guru is not in this class");
	
	
	//Prog7
//	String basket1 [] = {"Blue", "Green", "Red", "yellow", "Black", "Purple", "Red"};
//	String basket2 [] = {"Blue", "Red", "Red", "yellow", "Black", "Purple", "Red"};
//	int count = 0;
//	for(int i = 0; i<basket1.length; i++) {
//		if(basket1[i].equalsIgnoreCase("Red")||basket2[i].equalsIgnoreCase("Red"))
//			count++
//	}
	
	//Prog8
	String countries [] = {"India", "Japan", "USA", "Russia", "France"};
	String capitals [] = {"Delhi", "Tokyo", "DC", "Moscow", "Paris"};
	String reqCountry = "USA";
	for(int i = 0; i<countries.length; i++) {
		if(countries[i].equalsIgnoreCase("USA"))
			System.out.println("Capital of the USA is "+capitals[i]);
	}
	
	//Prog9
	
	
	}
}
