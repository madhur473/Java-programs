import java.util.Scanner;

public class LogicMain1 {

	public static void main(String[] args) {
		Logic m=new Logic();
		Scanner sc=new Scanner(System.in);
		System.out.println("1.factor\n2.factorial\n3.prime\n4.reverse\n5.fibbo\n6.palindrome\n7.Sum of Digit \n8.Base Power");
		System.out.println("Enter yout choice");
		int ch=sc.nextInt();
		switch(ch) {
		case 1:
			m.factor();
			break;
		case 2:
			m.factorial();
			break;
		case 3:
			m.prime();
			break;
		case 4:
			m.reverse();
			break;
		case 5:
			m.fibbo();
			break;
		case 6:
			m.Palindrome();
			break;
		case 7:
			m.SumofDigit();
			break;
		case 8:
			m.basePower();
			break;
		}
	}
}
