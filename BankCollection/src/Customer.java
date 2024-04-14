import java.util.List;
public class Customer {
	
	private int custId;
	private String custName;
	private Address addrs;
	private List<Account> lstaccount;
	public Customer(int custId, String custName, Address addrs, List<Account> lstaccount) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.addrs = addrs;
		this.lstaccount = lstaccount;
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
	public Address getAddrs() {
		return addrs;
	}
	public void setAddrs(Address addrs) {
		this.addrs = addrs;
	}
	public List<Account> getLstaccount() {
		return lstaccount;
	}
	public void setLstaccount(List<Account> lstaccount) {
		this.lstaccount = lstaccount;
	}
	
	

}


	