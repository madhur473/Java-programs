import java.util.Scanner;

public class Calculation {
	Scanner sc=new Scanner(System.in);
	int n1=sc.nextInt();
	int n2=sc.nextInt();
	public void addData() {
		int add=n1+n2;
		System.out.println("Addition of "+n1+" and "+n2+" is "+add);
	}
	
	public void subData() {
		int sub=n1-n2;
		System.out.println("Substraction of "+n1+" and "+n2+" is "+sub);
	}
	
	public void multiData() {
		int multi=n1*n2;
		System.out.println("Multiplication of "+n1+" and "+n2+" is "+multi);
	}
	public void divideData() {
		int div=n1/n2;
		System.out.println("Division of "+n1+" and "+n2+" is "+div);
	}
}
