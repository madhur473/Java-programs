
public class EmployeeMain {

	public static void main(String[] args) {
		Employee eobj=new Employee();
		eobj.setEmpId(101);
		eobj.setEmpname("Madhur");
		eobj.setEmpSal(4200000);
		System.out.println("Employee Id: "+eobj.getEmpId());
		System.out.println("Employee name: "+eobj.getEmpname());
		System.out.println("Employee Salary: "+eobj.getEmpSal());

	}

}
