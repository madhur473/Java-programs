import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankInfo {
	
	public Customer create() {
		
		Scanner sc =new Scanner(System.in);
		List<Account>lstaccount=null;
		System.out.println("Enter customer id");
		int custId=sc.nextInt();
		System.out.println("Enter customer Name:");
		String custName=sc.next();
		System.out.println("Enter City");
		String city=sc.next();
		System.out.println("Enter State");
		String State=sc.next();
		System.out.println("Enter Pincode");
		int pincode=sc.nextInt();
		Address addr=new Address(city, State, pincode);
		String str=null;
		Account acc=null;
		lstaccount =new ArrayList<Account>();
		do
		{
			System.out.println("Enter account number");
			int accNumber=sc.nextInt();
			System.out.println("Enter account Type");
			String accType=sc.next();
			System.out.println("Enter account bal");
			double accBal=sc.nextDouble();
			
			if(accType.equals("Savings")) {
				acc=new Account(accNumber, accType, accBal);				
			}
			else if(accType.equals("Current")) {
				acc=new Account(accNumber, accType, accBal);				
			}
			
			lstaccount.add(acc);
			System.out.println("Do you want to create new account");
			str=sc.next();
		}while(str.equals("yes"));
		
		Customer cust=new Customer(custId, custName, addr, lstaccount);
		return cust;
	}
	public void display(Customer cust)
	{
		System.out.println("Customer ID:"+cust.getCustId());
		System.out.println("Customer Name:"+cust.getCustName());
		System.out.println("Customer City:"+cust.getAddrs().getCity());
		System.out.println("Customer State:"+cust.getAddrs().getState());
		System.out.println("Customer Pincode:"+cust.getAddrs().getPincode());
		System.out.println("-------------------ACCOUNT DETAILS-----------------");
		List<Account> lstaccount=cust.getLstaccount();
		for(Account a:lstaccount) {
		System.out.println("Account Number:"+a.getAccno());
		System.out.println("Account Type:"+a.getAcctype());
		System.out.println("Account Balance:"+a.getAccbal());
		}
		System.out.println("-------------THANK YOU--------------");
	}
}

	