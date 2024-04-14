
public class CalculationMain {

	public static void main(String[] args) {
		Calculation calci=new Calculation(32, 22);
		Calculation calci2=new Calculation(2, 10);
		CalculationThread thread1=new CalculationThread(calci);
		CalculationThread thread2=new CalculationThread(calci2);
		thread1.start();
		thread2.start();
		System.out.println("Thanks ");
		

	}

}
