import java.util.Scanner;

public class Area {
	Scanner sc= new Scanner(System.in);
	
	public void AreaCircle() {
		System.out.println("Circle");
		
		System.out.println("Enter Radius of Circle: ");
		int r=sc.nextInt();
		double pi=3.14;
		double area=pi*r*r;
		System.out.println("Area of Circle = "+area);
	}
	
	public void AreaTriangle() {
		System.out.println("Triangle");
		System.out.println("Enter base and Height:");
		float b=sc.nextFloat();
		float h=sc.nextFloat();
		float area=0.5f*b*h;
		System.out.println("Area of triangle: "+area);
	}
	
	public void AreaRectangle() {
		System.out.println("Rectangle");
		System.out.println("Enter Breadth and Length:");
		float b=sc.nextFloat();
		float l=sc.nextFloat();
		float area=l*b;
		System.out.println("Area of Rectangle: "+area);
	}

}

