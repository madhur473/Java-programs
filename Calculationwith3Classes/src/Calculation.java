
public class Calculation {
	
	private  int num1;
	private int num2;
	public Calculation(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public void getSum() {
		int sum=num1+num2;
		System.out.println("Sum of Given no is: "+sum);
	}
	
	public void getDiv() {
		int sum=num1/num2;
		System.out.println("Division of Given no is: "+sum);
	}
	public void getMul() {
		int sum=num1*num2;
		System.out.println("Multiplication of Given no is: "+sum);
	}
	
	

}
