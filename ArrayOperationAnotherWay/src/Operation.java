import java.util.Scanner;

public class Operation {
	Scanner sc =new Scanner(System.in);
	int temp;
	public int createArray(int x[]) {
		System.out.println("How many Elements do you want in Array");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			x[i]=sc.nextInt();
		}
		return n;
	}
	public int displayData(int arr[],int n) {
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]+"\t");
		}
		return n;
	}
	
	public boolean searchData(int arr[],int n,int search) {
		boolean b=false;
		for(int i=0;i<n;i++)
		{
			if(arr[i]==search)
			{
				b=true;
				break;
			}
		}
		return b;
	}
	public int sorting(int arr[],int n) {
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
		return n;
	}
	public int insertVal(int arr[],int n,int newVal,int loc) {
		for(int i=n-1;i>=loc;i--)
		{
			arr[i+1]=arr[i];
		}
		arr[loc-1]=newVal;
		return n++;
	}
	public int deleteVal(int arr[],int n,int loc) {
		temp=arr[loc-1];
		for(int i=loc-1;i<n;i++)
		{
			arr[i]=arr[i+1];
		}
		return n--;
	}
	
	
}
