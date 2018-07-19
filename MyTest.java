package trail2;

import trail.*;

public class MyTest extends LabTrainer {
	public static void main(String[] args) {
		LabTrainer lt = new LabTrainer();
		
//		print(lt);
		MyTest mt = new MyTest();
		mt.print();
		System.out.println(mt.salary);
	}
	
	{
		
	}
	public  void print()
	{
		System.out.println(this.salary);
		salary = 100;
	}
}
