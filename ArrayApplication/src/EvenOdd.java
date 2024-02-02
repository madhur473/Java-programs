import java.util.Scanner;

public class EvenOdd {
	public static void main(String [] args) {
		Scanner sc =new Scanner(System.in);
		int i;
		System.out.println("How many element do  you want in array");
		int n=sc.nextInt();	
		int arr[]= new int[n];
		int even=0;
		int odd=0;
		System.out.println("element in array");
			for(i=0;i<arr.length;i++)
			{
				arr[i]=sc.nextInt();
				if(arr[i]%2==0)
				{
					even++;
				}
				else
				{
					odd++;
				}
			}
			System.out.println("Total Even number ="+even);
			System.out.println("Total Odd number ="+odd);
	}

}
