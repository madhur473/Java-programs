import java.util.Scanner;

public class StudentMarksheet {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Roll Number: ");
		int rollNo=sc.nextInt();
		System.out.println("Enter Student Name: ");
		String stuName =sc.next();
		System.out.println("Enter Mark of 5 Subject:");
		int m1=sc.nextInt();
		int m2=sc.nextInt();
		int m3=sc.nextInt();
		int m4=sc.nextInt();
		int m5=sc.nextInt();
		int Total=m1+m2+m3+m4+m5;
		float Per=Total/5;
		System.out.println("--------------------------------------------------------");
		System.out.println("RollNo\tName\tM3\tDMPT\tTOC\tDBMS\tCN\tTotal\tPercentage");
		System.out.println(rollNo+"\t"+stuName+"\t"+m1+"\t"+m2+"\t"+m3+"\t"+m4+"\t"+m5+"\t"+Total+"\t"+Per);
		System.out.println("--------------------------------------------------------");
	}

}
