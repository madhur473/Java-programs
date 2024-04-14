
public class BankMain {

	public static void main(String[] args) {
		BankInfo binfo=new BankInfo();
		Customer cust=binfo.create();
		binfo.display(cust);
	}
}
