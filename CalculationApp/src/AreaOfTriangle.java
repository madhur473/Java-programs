import java.util.Scanner;

public class AreaOfTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter base and Height:");
		float b=sc.nextFloat();
		float h=sc.nextFloat();
		float area=0.5f*b*h;
		System.out.println("Area of triangle: "+area);
	}

}
