
public class Mobile {
	private String str;
	public Mobile() {
	}
	
	public synchronized void call (String str) {
		for(int i=1;i<=5;i++) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(str+"Calling"+i);
		}
	}
}
