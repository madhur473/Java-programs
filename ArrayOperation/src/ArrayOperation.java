import java.util.Scanner;

public class ArrayOperation {

	public static void main(String[] args) {
		int arr[]=new int[20];
		int n=0,c=0;
		int loc=0;
		int temp=0;
		Scanner sc =new Scanner(System.in);
		
		int ch;
		do
		{
			System.out.println("1-Create\n2-Display\n3-Search\n4-Sort\n5-Insert new value\n6-Delete Value");
			System.out.println("\nEnter your choice:");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println("Enter how many element you want to enter: ");
				n=sc.nextInt();
				System.out.println("\nEnter"+n+"Elements in array");
				for(int i=0;i<n;i++)
				{
					arr[i]=sc.nextInt();
				}
				break;
			case 2:
				System.out.println("Entered Elements are:\n");
				for(int i=0;i<n;i++)
				{
					System.out.println(arr[i]);

				}
				break;
			case 3:
				boolean b=false;
				System.out.println("Enter number to search in array: ");
				int search=sc.nextInt();
				for(int i=0;i<n;i++)
				{
					if(arr[i]==search)
					{
						b=true;
						break;
					}
				}
				if(b)
				{
					System.out.println("Element Found");
				}
				else
				{
					System.out.println("Element not Found");
				}
				break;
			case 4:
				for(int i=0;i<n;i++)
				{
					for(int j=i+1;j<n;j++)
					{
						if(arr[i]>arr[j])
						{
							temp=arr[i];
							arr[i]=arr[j];
							arr[j]=temp;									
						}
					}
				}
				System.out.println("Sorting");
				break;
			case 5:
				System.out.println("Enter new Value and location you want to insert");
				int newVal=sc.nextInt();
				loc=sc.nextInt();
				for(int i=n-1;i>=loc;i--)
				{
					arr[i+1]=arr[i];
				}
				arr[loc-1]=newVal;
				n++;
				break;
			case 6:
				System.out.println("Enter location to delete value");
				loc=sc.nextInt();
				temp=arr[loc-1];
				for(int i=loc-1;i<n;i++)
				{
					arr[i]=arr[i+1];
				}
				n--;
				System.out.println("Value deleted "+temp);
				break;
			}
			System.out.println("Do you want to continue, Press 1");
			c=sc.nextInt();
		}while(c==1);
	}
}

