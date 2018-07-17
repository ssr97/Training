class Animal{
	void speak()
	{
		System.out.println("No sound specified");
	}
}

class Cat extends Animal{
	@Override
	void speak()
	{
		System.out.println("Meow");
	}
}

class Dog extends Animal{
	@Override
	void speak()
	{
		System.out.println("Bark");
	}
}

class Horse extends Animal{
	@Override
	void speak()
	{
		System.out.println("Neigh");
	}
}

 class AnimalSound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		invokeSound(args[0]);

	}

	private static void invokeSound(String string) {
		// TODO Auto-generated method stub
		Animal a=null;
		if(string.equalsIgnoreCase("Dog"))
			a = new Dog();
		else if(string.equalsIgnoreCase("Cat"))
			a = new Cat(); 
		else if(string.equalsIgnoreCase("Horse"))
		a = new Horse();
		
		a.speak();
		
	}

}
