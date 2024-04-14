import java.util.List;
import java.util.ArrayList;

public class ProductCollection {
	public static void main(String[] args) {
		List<Product> lstproduct=accept();
		display(lstproduct);
	}
	public static List<Product> accept(){
		Product prod1=new Product(101,"Laptop", 50000, 2);
		Product prod2=new Product(102,"AC", 50000, 1);
		Product prod3=new Product(106,"Fridge", 50000, 2);
		Product prod4=new Product(1,"Tv", 50000, 3);
		Product prod5=new Product(110,"Washing Machine", 1500, 1);
		
		List<Product> lstproduct = new ArrayList<Product>();
		lstproduct.add(prod1);
		lstproduct.add(prod2);
		lstproduct.add(prod3);
		lstproduct.add(prod4);
		lstproduct.add(prod5);
		return lstproduct;
	}
	public static void display(List<Product> lstproduct) {
		for(Product p:lstproduct) {
			System.out.println(p.getProdId()+"\t"+p.getProdName()+"\t"+p.getProdPrice()+"\t"+p.getProQty());
;
		}
		}
	}

