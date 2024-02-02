import java.util.Scanner;

class Array1 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int i;
		System.out.println("How many element do  you want in array");
		int n=sc.nextInt();	
		int arr[]= new int[n];
		System.out.println("element in array");
			for(i=0;i<arr.length;i++)
			{
				arr[i]=sc.nextInt();
			}
			System.out.println("Element from array are\n");
			for(i=0;i<arr.length;i++) {
				System.out.println(arr[i]);
			}
			System.out.println("Reverse array");
			for(i=arr.length-1;i>=0;i--) {
				System.out.println(arr[i]);
			}
		}
	}
