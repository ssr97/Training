
public class testCar {
	public static void main(String[] args) {
		Car cars[] = new Car[5];

		for (int i = 0; i < cars.length; i++)
			cars[i] = new Car();
		cars[0].setCarDetails("Honda City", 12, 15000, false);
		cars[1].setCarDetails("Balaeno", 15, 8000, false);
		cars[2].setCarDetails("Fortunner", 10, 30000, true);
		cars[3].setCarDetails("Maruti 800", 17, 5000, false);
		cars[4].setCarDetails("Mercedes CLA 200", 14, 40000, true);
		int pos = 0;
		double max = 0;
		for (int i = 0; i < cars.length; i++) {
			cars[i].printDetails();
			if (cars[i].price > max) {
				max = cars[i].price;
				pos = i;
			}
		}
		System.out.println("The costliest car is " + cars[pos].carName);
		chooseMyCar(cars);
	}

	public static void chooseMyCar(Car[] cars) {
		// TODO Auto-generated method stub
		System.out.println("Your filtered cars are");
		for (int i = 0; i < cars.length; i++) {
			if (cars[i].mileage >= 10 && cars[i].price <= 23000)
				cars[i].printDetails();
			System.out.println("--------------------------------------");
		}

	}

}
