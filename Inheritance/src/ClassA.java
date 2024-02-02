
public class ClassA {
	protected int x=10;
	public A()
	{
		System.out.println("class A Constructor");
	}
	public A(int n)
	{
		System.out.println("Parametric constructor of a class A");
	}
	public void show()
	{
		System.out.println("Hello base class show method");
	}
}

class B extends A
{
	int x=20;
	public B()
	{
		super(100);
		System.out.println("class B constructor");
	}
	public void show()
	{
		
	}

}
