
public class Employee {
private int employeeId;
int employeeName;
int employeeSalary;
static int testVariable;

Employee(int id, int name, int sal){
	employeeId = id;
	employeeName = name;
	employeeSalary = sal;
}



public double calculateBonus()
{
	double bonus = 0;
	if(employeeSalary <= 5000)
		bonus = employeeSalary*0.2;
	else
		bonus = employeeSalary * 0.1;
			
	return bonus;
}

}
