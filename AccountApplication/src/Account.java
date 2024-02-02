
public class Account {
	//instance variable
	private int accNo;
	private String custName;
	private double accBal;
	public Account(int accNo, String custName, double accBal) {
		super();
		this.accNo = accNo;
		this.custName = custName;
		this.accBal = accBal;
	}
	//this. is  to identify the current variable
		//here int is (return type)	
	public int getAccNo() {
		return accNo;
	}
						//argument
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public double getAccBal() {
		return accBal;
	}
	public void setAccBal(double accBal) {
		this.accBal = accBal;
	}
	

}
