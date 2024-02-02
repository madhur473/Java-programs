
public class Account {
	
	private int accNumber;
	private String addType;
	private double addBalance;
	private String ifscCode;
	public Account(int accNumber, String addType, double addBalance, String ifscCode) {
		super();
		this.accNumber = accNumber;
		this.addType = addType;
		this.addBalance = addBalance;
		this.ifscCode = ifscCode;
	}
	public int getAccNumber() {
		return accNumber;
	}
	public void setAccNumber(int accNumber) {
		this.accNumber = accNumber;
	}
	public String getAddType() {
		return addType;
	}
	public void setAddType(String addType) {
		this.addType = addType;
	}
	public double getAddBalance() {
		return addBalance;
	}
	public void setAddBalance(double addBalance) {
		this.addBalance = addBalance;
	}
	public String getIfscCode() {
		return ifscCode;
	}
	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}
	

}
