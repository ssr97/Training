package trail2;

class Address{
	String flatNo;
	String line1;
	String line2;
	String city;
	String state;
	void printDetails()
	{
		System.out.println(flatNo+" ,"+ line1+" "+line2+" "+ city+", "+state);
	}
}

class Employee{
	double salary;
	String name;
	int eid;
	String dept;
	Address addr;
	
	Employee(double sal, String name, int eid, String dept, Address a){
		salary = sal;
		this.name = name;
		this.eid = eid;
		this.dept = dept;
		this.addr = a;
	}
	
	public void printDetails()
	{
		System.out.println("Name- "+name);
		System.out.println("EID- "+eid);
		System.out.println("Department- "+dept);
		System.out.println("Salary- "+salary);
		addr.printDetails();
	}
}
public class HASADemo {
	public static void main(String args[])
	{
		Address a = new Address();
		a.flatNo = "B-604";
		a.line1 = "Grevillea, Magarpatta City";
		a.line2 = "Hadapsar";
		a.city = "Pune";
		a.state = "Maharashtra";
		
		Employee e = new Employee(1500000, "Shaurya Rawat", 1, "IT", a);
		e.printDetails();
	}
}
