//MultiThreading
public class MobileMain {

	public static void main(String[] args) {
		
		Mobile mob=new Mobile();
		MobileThread thread1=new MobileThread(mob,"Madhur");
		MobileThread thread2=new MobileThread(mob,"Rajveer");
		thread1.start();
		thread2.start();
		System.out.println("Thank you");
	}
}
	