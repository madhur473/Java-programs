
public class Developer extends Employee {
	 
	private int noofhrs;

	public Developer(int empid, String empName, double empSalaary, int noofhrs) {
		super(empid, empName, empSalaary);
		this.noofhrs = noofhrs;
	}

	public int getNoofhrs() {
		return noofhrs;
	}

	public void setNoofhrs(int noofhrs) {
		this.noofhrs = noofhrs;
	}
	
	

}
