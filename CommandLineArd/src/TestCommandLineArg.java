
public class TestCommandLineArg {

	public static void main(String[] args) {
		System.out.println("length pf args is: "+args.length);
		int sum=0;
		for(int i=0;i<args.length;i++) {
			sum=sum+Integer.parseInt(args[i]);
		}
		System.out.println("Sum of given nos is: "+sum);
			
	}

}
//run as-> run  config -> Arguements -> input to program args.