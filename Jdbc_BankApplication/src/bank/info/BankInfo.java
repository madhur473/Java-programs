package bank.info;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import bank.dao.BankDao;
import bank.dao.BankDaoImpl;
import bank.entity.Account;


public class BankInfo {
	
	BankDao bdao=new BankDaoImpl();

		Scanner sc=new Scanner(System.in);
		int cnt=0;
		
		public int create() {
			
		String str=null;
		List<Account> lstacc=new ArrayList<Account>();
		
		do {
			System.out.println("Enter Account number");
			int accNumber=sc.nextInt();
			System.out.println("Enter Customer Name");
			String custName=sc.next();
			System.out.println("Enter Account Bal");
			float accBal=sc.nextFloat();
			Account acc=new Account(accNumber, custName, accBal);
			lstacc.add(acc);
			System.out.println("Do you want to continue press yes/no");
			str=sc.next();
		}while(str.equals("yes"));
		
		bdao.createRecord(lstacc);
		return cnt;
	}
	public void displayAll() {
		List<Account> lstall=null;
		lstall=bdao.displayAll();
		for(Account acc:lstall) {
			System.out.println(acc.getAccNumber()+"\t"+acc.getCustName()+"\t"+acc.getAccBal());
		}
	}
	public int updateRecord() {
		System.out.println("Enter account number and new acc bal to update record");
		int accNumber=sc.nextInt();
		float accBal=sc.nextFloat();
		
		Account acc = new Account();
		acc.setAccNumber(accNumber);
		acc.setAccBal(accBal);
		
		List<Account> lstupdate=new ArrayList<Account>();
		lstupdate.add(acc);
		cnt=bdao.updateRecord(lstupdate);
		return cnt;
	}
	
	public int delete(int accNumber) {
		int i=bdao.deleteRecord(accNumber);
		return i;
	}
	public void search(int accNumber) {
		List<Account> lstAccount=null;
		lstAccount=bdao.retriveRecord(accNumber);
		Account a=lstAccount.get(0);
		if(a!=null) {
			System.out.println(a.getAccNumber()+"\t"+a.getCustName()+"\t"+a.getAccBal());
		}
		else
		{
			System.out.println("no record found");
		}
	}
}
