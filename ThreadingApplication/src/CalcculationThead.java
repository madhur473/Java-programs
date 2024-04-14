
public class CalcculationThead extends Thread {
	
	private int n1;
	private int n2;
	public CalcculationThead(int n1, int n2) {
		this.n1 = n1;
		this.n2 = n2;
	}
	
	public void run() {
		getSum();
	}
	public void getSum() {
		int sum=n1+n2;
		System.out.println("Sum ="+sum);
	}
	
	
	

}
