
public class MobileThread extends Thread{
	
	private Mobile mob;
	private String str;
	
	public MobileThread(Mobile mob, String str) {
		this.mob = mob;
		this.str = str;
	}
	public void run() {
		mob.call(str);
	}

}
