import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeInfo {
	public static List<Employee> accept(){
		String str=null;
		List<Employee> lstemp= new ArrayList<Employee>();
		Scanner sc=new Scanner(System.in);
		
		do
		{
			System.out.println("Enter Employee id");
			int empId=sc.nextInt();
			System.out.println("Enter employee name");
			String empName=sc.next();
			System.out.println("Enter employee Salary");
			double empSalary=sc.nextDouble();
			
			Employee eobj=new Employee(empId, empName, empSalary);
			
			lstemp.add(eobj);
			System.out.println("Do you want to add next object press yes/no");
			
			str=sc.next();
		}while(str.equals("yes"));
		
		return lstemp;
	}
	public static void display(List<Employee> lstemp) {
		for(Employee e:lstemp) {
			System.out.println(e.getEmpId()+"\t"+e.getEmpName()+"\t"+e.getEmpSalary());
	
		}
	}
	public Employee searchRecord(List<Employee> lstemployee,int empid) {
		Employee emptemp=null;
		for(Employee e:lstemployee) {
			if(e.getEmpId()==empid) {
				emptemp=e;
				break;
			}
		}
		return emptemp;
	}
	public void deleteEmployee(List <Employee> lstemp,Employee emptemp) {
		lstemp.remove(emptemp);
		System.out.println("Employee Deleted!!");
	}
	
	public void updateEmployee(List<Employee> lstemployee, int empid3, double newsalary) {
	    Employee employeeToUpdate = null;
	    for (Employee e : lstemployee) {
	        if (e.getEmpId() == empid3) {
	            employeeToUpdate = e;
	            break;
	        }
	    }
	    if (employeeToUpdate != null) {
	        employeeToUpdate.setEmpSalary(newsalary);
	        System.out.println("Employee with ID " + empid3 + " updated with new salary: " + newsalary);
	    } else {
	        System.out.println("Employee with ID " + empid3 + " not found.");
	    }
	}

}	

