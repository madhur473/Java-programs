import java.util.Scanner;

public class Employee {
	//instance variable
	int empId;
	String empName;
	double empSalary;
	double pf,hra,ta,gs;
	
	public void accept() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee Id: ");
		empId =sc.nextInt();
		
		System.out.println("Enter Employee Name: ");
		empName=sc.next();
		
		System.out.println("Enter Empoyee Salary: ");
		empSalary=sc.nextDouble();
	}
	
	public void calculate() {
		hra=empSalary*0.4;
		ta=empSalary*0.1;
		pf=empSalary*0.1;
		gs=empSalary+ta+hra+pf;
	}
	public void display() {
		
		System.out.println("\t\tEmployee Id:\t\t "+empId);
		System.out.println("\t\tEmployee Name:\t\t "+empName);
		System.out.println("\t\tEmployee Salary:\t "+empSalary);
		System.out.println("\t\tHRA:\t\t\t "+hra);
		System.out.println("\t\tTA:\t\t\t "+ta);
		System.out.println("\t\tPF:\t\t\t "+pf);
		System.out.println("\t\tGross Salary:\t\t"+gs);
	}
}
