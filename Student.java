
public class Student {
String studentName;
double m1,m2,m3;
char grade;
String result;

public char returnGrade() {
	double total = this.m1+this.m2+this.m3;
	double percentage = (total/3);
	if(percentage>=90) {
		return 'A';
	}
	else if(percentage>=80 && percentage<=89)
		return 'B';
	else if (percentage>=70 && percentage<=79)
		return 'C';
	else 
		return 'F';
}

public String returnResult()
{
	if (this.m1<35 || this.m2<35 || this.m3<35)
		this.result = "FAIL";
	else
		this.result = "PASS";
	return result;
}

public void display()
{
	System.out.println("total = "+(m1+m2+m3)+" percentage = "+ ((m1+m2+m3)/3) + " grade = "+returnGrade() +" result="+ returnResult());
}
}
