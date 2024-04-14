import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ProductInfo {

	public static List<Product> accept() {
		//Scanner class
		Scanner sc=new Scanner(System.in);
		List<Product> lstproduct=new LinkedList<Product>();
		String str=null;
		do
		{
			System.out.println("Enter product id");
			int prodId=sc.nextInt();
			System.out.println("Enter product name");
			String prodName=sc.next();
			System.out.println("Enter product price");
			double prodPrice=sc.nextDouble();
			System.out.println("Enter product qty");
			int prodQty=sc.nextInt();
			Product prod=new Product(prodId,prodName, prodPrice, prodQty);
			lstproduct.add(prod);
			System.out.println("DO you want to continue to ad products press yes/no");
			str=sc.next();
		}while(str.equals("yes"));
		return lstproduct;
	}
	public static void display(List<Product> lstproduct) {
		for(Product p:lstproduct) {
			//System.out.println(p);
			System.out.println
			(p.getProdId()+"\t"+p.getProdName()+"\t"+p.getProdPrice()+"\t"+p.getProdQty());
		}
	}
	public Product search(List<Product> lstproduct,int prodid) {
		Product prodtemp=null;
		for(Product p:lstproduct) {

			if(p.getProdId()==prodid) {
				prodtemp=p;
				break;
			}
		}
		return prodtemp;
	}
	public void deleteProduct(List<Product> lstproduct,Product prodtemp) {
		lstproduct.remove(prodtemp);
	}
}
