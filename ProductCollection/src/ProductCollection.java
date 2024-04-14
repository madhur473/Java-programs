import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
public class ProductCollection {
	public static void main(String[] args) {
		int ch=0;
		List<Product> lstproduct=null;
		Scanner sc=new Scanner(System.in);
		Product prodtemp=null;
		ProductInfo pinfo=new ProductInfo();
		String str=null;
		do
		{
			System.out.println("1-Create\n2-Display\n3-Search\n4-Delete");
			System.out.println("Enter your choice");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				lstproduct=pinfo.accept();
				break;
				
			case 2:
				pinfo.display(lstproduct);
				break;
				
			case 3:
				System.out.println("Enterproduct id to search product");
				int prodid=sc.nextInt();
				prodtemp=pinfo.search(lstproduct, prodid);
				if(prodtemp!=null) {
					System.out.println("Valid product");					
					System.out.println("Object deleted...");
				}
				else
				{
					System.out.println("Invalid product id");
				}
				break;
				
			case 4://delete
				System.out.println("Enter product id to delete product");
				int prodid1=sc.nextInt();
				prodtemp=pinfo.search(lstproduct, prodid1);
				if(prodtemp!=null) {
					pinfo.deleteProduct(lstproduct, prodtemp);
					System.out.println("Object deleted...");
				}
				else
				{
					System.out.println("Invalid product id");
				}
				break;
			}
			System.out.println(" do you want to continue to other operation press yes/no");
			str=sc.next();	
			
		}while(str.equals("yes"));
	}
}
