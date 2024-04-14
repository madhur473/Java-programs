
public class ThreadApplication extends Thread{
	
	public void run()
	{
		display();
	}
	
	public void display()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Thread:" +i );
		}try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}

}
