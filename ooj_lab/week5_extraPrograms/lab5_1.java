import java.util.Scanner;
class Employee{
	Double emphra,empda,empit,empgross,empbasic;
	int empnohrs;
	String empname,empid;
	void Accept(){
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter employee hra:");
		emphra = s1.nextDouble();
		System.out.println("Enter employee da:");
		empda = s1.nextDouble();
		System.out.println("Enter employee it:");
		empit = s1.nextDouble();
		System.out.println("Enter employee basic salary:");
		empbasic = s1.nextDouble();
		System.out.println("Enter number of employee hours:");
		empnohrs = s1.nextInt();
		System.out.println("Enter employee name:");
		empname = s1.next();
		System.out.println("Enter employee id:");
		empid = s1.next();
		if(emphra>100 || empda>100 || empit>100){
			System.out.println("invalid input");
		}
	}
	void Calc(){
		empgross = empbasic+empbasic*emphra+empbasic*empda-empbasic*empit;
	}
	void Overtime(){
		int oamount = 100, addition;
		if(empnohrs>200){
			addition = empnohrs*oamount;
			empgross = empgross + addition;
			System.out.println("The employee gross salary is:" +empgross);
		}
		else if(empnohrs<200){
			addition = empnohrs*oamount;
			empgross = empgross - addition;
			System.out.println("The employee gross salary is:" +empgross);
		}
	}
}
class Emain{
	public static void main(String args[]){
		Employee o1 = new Employee();
		o1.Accept();
		o1.Calc();
		o1.Overtime();
	}

}
