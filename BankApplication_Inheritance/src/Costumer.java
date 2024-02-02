
public class Costumer {
	private int custId;
	private String custName;
	private Address addr;
	private Account accObj;
	public Costumer(int custId, String custName, Address addr, Account accObj) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.addr = addr;
		this.accObj = accObj;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	public Account getAccObj() {
		return accObj;
	}
	public void setAccObj(Account accObj) {
		this.accObj = accObj;
	}
	

}
