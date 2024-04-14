//by implementing Runnable Interface
public class CalculateThread2 implements Runnable {
	
	private int n1;
	private int n2;
	
	public CalculateThread2(int n1, int n2) {
		this.n1 = n1;
		this.n2 = n2;
		Thread thread1 =new Thread(this);
		thread1.start();
	}
	
	public void run() {
		getSum();
	}
	public void getSum() {
		int sum=n1+n2;
		System.out.println("Sum ="+sum);
	}
}

