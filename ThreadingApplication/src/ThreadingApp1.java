
public class ThreadingApp1 {

	public static void main(String[] args) {//main is 1 Thread Main Thread
		//Thread Created...
		ThreadApplication thread1=new ThreadApplication();
		//thread is runnable
		thread1.start();
		System.out.println("Thank You");
	}

}
