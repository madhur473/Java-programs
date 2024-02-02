 
public class Manager extends Employee {
	private int bonus;

	public Manager(int empid, String empName, double empSalaary, int bonus) {
		super(empid, empName, empSalaary);
		this.bonus = bonus;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	

}
