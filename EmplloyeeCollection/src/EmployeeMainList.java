import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeMainList {

	public static void main(String[] args) {
		 
		int ch=0;
		Scanner sc=new Scanner(System.in);
		List<Employee> lstemp=null;
		EmployeInfo einfo =new EmployeInfo();
		
		String str=null;
		do
		{
			System.out.println("1.Create Employee\n2.Display Employee\n3.Search Employee\n4.Delete Employee\n5.Update Employee");
			System.out.println("Enter your choice");
			ch=sc.nextInt();
			
			switch(ch) {
			
			case 1:
				lstemp=einfo.accept();
				break;
			case 2:
				einfo.display(lstemp);
				break;
			case 3:
				System.out.println("Enter employee id to search record");
				int empid=sc.nextInt();

				Employee emptemp=einfo.searchRecord(lstemp, empid);
				if(emptemp!=null) {
					System.out.println("EMployee found");
				}
				else {
					System.out.println("Invalid employee id");
				}
				break;
			case 4:
				System.out.println("Enter employee id to search record");
				int empid2=sc.nextInt();
				Employee emptemp2=einfo.searchRecord(lstemp, empid2);
				if(emptemp2!=null) {
					einfo.deleteEmployee(lstemp, emptemp2);
					System.out.println("Employee deleted");
				}
				else {
					System.out.println("Invalid employee id");
				}
				break;
				
			case 5:
				System.out.println("Enter Employee id and new salary to update in records");
				int empid3=sc.nextInt();
				double newsalary=sc.nextDouble();
				einfo.updateEmployee(lstemp,empid3,newsalary);
				break;
			}
			System.out.println("DO you want to  continue to crud operation");
			str=sc.next();
		}while(str.equals("yes"));
		System.out.println("--------------THANK YOU--------------------");
	}	
}

