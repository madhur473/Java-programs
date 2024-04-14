package bank.mainapp;

import java.util.Scanner;

import bank.info.BankInfo;

public class BankMain {

	public static void main(String[] args) {
		BankInfo binfo=new BankInfo();
		int ch=0,cnt=0;
		int accNumber=0;
		String str=null;
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println("1.Create\n2.Delete\n3.Update\n4.Search\n5.Display All");
			System.out.println("Enter Your choice");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				cnt=binfo.create();
				if(cnt>0)
				{
					System.out.println("Total records save in database are"+cnt);
				}
				break;
			case 2:
				System.out.println("Enter account number to delete record");
				accNumber =sc.nextInt();
				cnt=binfo.delete(accNumber);
				if(cnt>0) {
					System.out.println("Record Deleted...");
				}
				break;
			case 3:
				cnt=binfo.updateRecord();
				System.out.println("Total record updated in table are"+cnt);
				break;
			case 4:
				System.out.println("Enter account number to search record");
				accNumber=sc.nextInt();
				binfo.search(accNumber);
				break;
			case 5:
				binfo.displayAll();
				break;
			}
		System.out.println("Do you want to continue press Yes/No");
		str=sc.next();
		}while(str.equals("yes"));
		System.err.println("------------------THANK YOU-------------------");
	}
}



