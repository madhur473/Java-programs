
public class EmployeeMain {
	public static void main(String []args) {
	
	Manager mobj =new Manager(101,"Madhur", 130000, 20000);
	System.out.println("Manager Id is ="+mobj.getEmpid());
	System.out.println("Manager Name is ="+mobj.getEmpName());
	System.out.println("Manager Salary is ="+mobj.getEmpSalaary());
	System.out.println("Manager Bonus is ="+mobj.getBonus());
	System.out.println("-------------------------------------------------");
	Developer dobj =new Developer(102,"Tejas", 120000, 10);
	System.out.println("Manager Id is ="+dobj.getEmpid());
	System.out.println("Manager Name is ="+dobj.getEmpName());
	System.out.println("Manager Salary is ="+dobj.getEmpSalaary());
	System.out.println("Developer Extra hours is ="+dobj.getNoofhrs());
}
}
