
public class SavingAccount extends Account{
	private float intrestRate;

	public SavingAccount(int accNumber, String addType, double addBalance, int ifscCode, float intrestRate) {
		this.intrestRate = intrestRate;
	}

	public float getIntrestRate() {
		return intrestRate;
	}

	public void setIntrestRate(float intrestRate) {
		this.intrestRate = intrestRate;
	}
	

}
