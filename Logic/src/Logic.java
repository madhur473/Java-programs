import java.util.Scanner;
public class Logic {
	Scanner sc =new Scanner(System.in);
	public void factor(){
		System.out.println("Enter any number");
		int n =sc.nextInt();
		for(int i= 2;i<=n/2;i++)
		{
			if(n%i==0) {
				System.out.println(i);
			}
		}
	}
	
	public void factorial() {
		System.out.println("Enter number to print factorial");
		int n=sc.nextInt();
		int result=1;
		for(int i=1;i<=n;i++)
		{
			result=result*i;
		}
		System.out.println("Factorial ="+result);
	}
	public void prime() {
		boolean b=true;
		System.out.println("Enter any number ");
		int n=sc.nextInt();
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				b=false;
				break;
			}
		}
			if(b) {
				System.out.println("Prime number");
			}
			else {
				System.out.println("Not Prime Number");
			}
		}
	public void reverse() {
		System.out.println("Enter any number to print in revese order");
		int n=sc.nextInt();
		int rev=0,r;
		while(n!=0) {
			r=n%10;
			rev=rev*10+r;
			n=n/10;
		}
		System.out.println("Reverse="+rev);
	}
	
	public void fibbo() {
		int i=0;
		int j=1;
		int k;
		int cnt=1;
		System.out.println("Fibbo Series");
		while(cnt<=10)
		{
			k=i+j;
			System.out.print(k+"\t");
			i=j;
			j=k;
			cnt++;
		}
	}
	public void Palindrome() {
		System.out.println("Enter any number to print in revese order");
		int n=sc.nextInt();
		int temp=n;
		int rev=0,r;
		while(n!=0) {
			r=n%10;
			rev=rev*10+r;
			n=n/10;
		}
		if(temp==rev)
		{
			System.out.println("Its palindrome");
		}
		else
		{
			System.out.println("Its Not palindrome");
		}
	}
	public void SumofDigit() {
		System.out.println("Enter any number to print in revese order");
		int n=sc.nextInt();
		int sum=0,r;
		while(n!=0) {
			r=n%10;
			sum=sum+r;
			n=n/10;
		}
		System.out.println("sum of digit"+sum);
	}
	public void basePower()
	{
		System.out.println("Enter base and power");
		int b=sc.nextInt();
		int p=sc.nextInt();
		int result=1;
		for(int i=1;i<=p;i++)
		{
			result=result*b;
		}
		System.out.println("Result is "+result);
	}
	
}

