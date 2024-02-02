import java.util.Scanner;

public class ArrayOperationMain {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int arr[]=new int[20];
		int n=0;
		int c,ch;
		int loc;
		boolean b=false;
		Operation obj=new Operation();
		do
		{
			System.out.println("1-Create\n2-Display\n3-Search\n4-Sort\n5-Insert new value\n6-Delete Value");
			System.out.println("\nEnter your choice:");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				n=obj.createArray(arr);
				break;
			case 2:
				obj.displayData(arr, n);
				break;
			case 3:
				System.out.println("Enter Element to be search");
				int s=sc.nextInt();
				b=obj.searchData(arr,n,s);
				if(b) {
					System.out.println("Valid");
				}
				else
				{
					System.out.println("InValid");
				}
				break;
			case 4:
				System.out.println("Sorting");
				obj.sorting(arr, n);
				break;
			case 5:
				System.out.println("Enter new Value and location you want to insert");
				int newVal=sc.nextInt();
				loc=sc.nextInt();
				obj.insertVal(arr,n,newVal,loc);
				break;
			case 6:
				System.out.println("Enter location to delete value");
				loc=sc.nextInt();
				obj.deleteVal(arr, n, loc);
				System.out.println("Value deleted ");
			}
			System.out.println("Do you want to continue, Press 1");
			c=sc.nextInt();
		}while(c==1);
	
	}

}
