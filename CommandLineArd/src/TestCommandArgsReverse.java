
public class TestCommandArgsReverse {

	public static void main(String[] args) {
		System.out.println("length of args is: "+args.length);
		int sum=0;
		for(int i=args.length-1;i>=0;i--) {
			sum=sum+Integer.parseInt(args[i]);
		}
		System.out.println("Sum of given nos is: "+sum);
			
	}

}
//run as-> run  config -> Arguements -> input to program args.
