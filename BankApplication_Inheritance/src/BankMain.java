import java.util.Scanner;

public class BankMain {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Costumer ID;");
		int custId=sc.nextInt();
		System.out.println("Enter Customer Name");
		String custName=sc.next();
		
		System.out.println("-------------------Address----------------");
		System.out.println("Enter City");
		String city=sc.next();
		System.out.println("Enter State");
		String state=sc.next();
		System.out.println("Enter pincode");
		int pincode=sc.nextInt();
		
		Address addrobj=new Address(city,state,pincode);
		System.out.println("--------------------------------------------");
		System.out.println("Enter Account Details");
		System.out.println("Enter Account Number");
		int accNumber=sc.nextInt();
		System.out.println("Enter Account Type");
		String addType=sc.next();
		System.out.println("Enter IFSC Code");
		int ifscCode=sc.nextInt();
		System.out.println("Enter Account Bal");
		double addBalance=sc.nextDouble();
		
		Account accobj=null;
		
		if(addType.equalsIgnoreCase("Saving"))
		{
			System.out.println("Enter Intrest rate");
			float intrestRate=sc.nextFloat();
			accobj=new SavingAccount(accNumber,addType,addBalance,ifscCode,intrestRate);
		}
		if(addType.equalsIgnoreCase("current"))
		{
			System.out.println("Enter Company Name");
			String companyName=sc.next();
			accobj=new CurrentAccount(accNumber,addType,addBalance,ifscCode,companyName);
		}
		Costumer custobj =new Costumer(custId,custName,addrobj,accobj);
		display(custobj);
		
		public static void display(Costumer cust){
			System.out.println("------------------CUSTOMER DETAILS------------------");
			System.out.println("Customer Id: "+cust.getCustId());
			System.out.println("Customer Name : "+cust.getCustName());
			System.out.println("--------------------ADDRESS DETAILS-------------------------------");
			System.out.println("City: "+cust.getAddr().getCity());
			System.out.println("State: "+cust.getAddr().getState());
			Account accobj=cust.getAccObj();
			System.out.println("-------------------ACCOUNT DETAILS--------------");
			System.out.println("Account Number: "+accobj.getAccNumber());
			System.out.println("Account Type: "+accobj.getAddType());
			System.out.println("Account IFSC: "+accobj.getIfscCode());
			System.out.println("Account Balance: "+accobj.getAddBalance());
			if(accobj instanceof SavingAccount)
			{
				SavingAccount sacc=(SavingAccount)accobj;
				System.out.println("Intrest Rate: "+sacc.getIntrestRate());
			}
			if(accobj instanceof CurrentAccount) {
				CurrentAccount cacc=(CurrentAccount)accobj;
				System.out.println("Company Name is: "+cacc.getCompanyName());
			}
			
			
			
			
			
		}
		

	}

	private static void display(Costumer custobj) {
		// TODO Auto-generated method stub
		
	}

}
