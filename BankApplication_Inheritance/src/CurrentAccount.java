
public class CurrentAccount extends Account {
	private String companyName;

	public CurrentAccount(int accNumber, String addType, double addBalance, int ifscCode, String companyName) {
		super(accNumber, addType, addBalance, ifscCode);
		this.companyName = companyName;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	

}
