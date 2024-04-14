package bank.entity;

public class Account {
	
	private int AccNumber;
	private String custName;
	private float accBal;
	public Account(int accNumber, String custName, float accBal) {
		super();
		AccNumber = accNumber;
		this.custName = custName;
		this.accBal = accBal;
	}
	public Account() {
	}
	public int getAccNumber() {
		return AccNumber;
	}
	public void setAccNumber(int accNumber) {
		AccNumber = accNumber;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public float getAccBal() {
		return accBal;
	}
	public void setAccBal(float accBal) {
		this.accBal = accBal;
	}
	
	
}
