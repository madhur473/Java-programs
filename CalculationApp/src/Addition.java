import java.util.Scanner;
public class Addition {
	public static void main(String[] args) {
		int n1, n2, addition;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Two Number:  ");
		n1=sc.nextInt();
		n2=sc.nextInt();
		addition=n1+n2;
		System.out.println("Addition of "+n1+" and "+n2+" is : "+addition);				
	}

}
