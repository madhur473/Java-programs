
public class Customer {
	private int custId;
	private String custName;
	private String mobNumber;
	private Address addr;
	private Product prodArr[];
	public Customer (int custId, String custName,String mobNumber,Address addr,Product prodArr[]) {
		super();
		this.custId=custId;
		this.custName=custName;
		this.mobNumber=mobNumber;
		this.addr=addr;
		this.prodArr=prodArr;
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
	public String getMobNumber() {
		return mobNumber;
	}
	public void setMobNumber(String mobNumber) {
		this.mobNumber = mobNumber;
	}
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	public Product[] getProdArr() {
		return prodArr;
	}
	public void setProdArr(Product[] prodArr) {
		this.prodArr = prodArr;
	}
	

}
