
public class Employee {
	
	private int empid;
	private String empName;
	private double empSalaary;
	public Employee(int empid, String empName, double empSalaary) {
		super();
		this.empid = empid;
		this.empName = empName;
		this.empSalaary = empSalaary;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getEmpSalaary() {
		return empSalaary;
	}
	public void setEmpSalaary(double empSalaary) {
		this.empSalaary = empSalaary;
	}
	
	
	
	

}
