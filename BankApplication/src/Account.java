
public class Account {
	private int accno;
	private String cusName;
	private double accBal;
	public Account(int accno, String cusName, double accBal) {
		super();
		this.accno = accno;
		this.cusName = cusName;
		this.accBal = accBal;
	}
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public String getCusName() {
		return cusName;
	}
	public void setCusName(String cusName) {
		this.cusName = cusName;
	}
	public double getAccBal() {
		return accBal;
	}
	public void setAccBal(double accBal) {
		this.accBal = accBal;
	}
	
}
