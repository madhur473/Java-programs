
public class CalculationThread extends Thread{
	
	private Calculation Calci;

	public CalculationThread(Calculation calci) {
		Calci = calci;
	}
	public void run() {
		Calci.getSum();
		Calci.getDiv();
		Calci.getMul();
	}
}
