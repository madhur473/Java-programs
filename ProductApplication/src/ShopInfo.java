import java.util.Scanner;

public class ShopInfo {
	public Product[] createProduct() {
		Scanner sc=new Scanner(System.in);
		System.out.println("How many product do you want: ");
		int n=sc.nextInt();
		Product prodarr[]=new Product[n];
		for(int i=0;i<prodarr.length;i++) {
			System.out.println("Enter Product id,name,price,qty");
			int proId=sc.nextInt();
			String prodName=sc.next();
			double prodPrice=sc.nextDouble();
			int proQty=sc.nextInt();
			Product prod = new Product(proId, prodName, prodPrice, proQty);
			prodarr[i]=prod;
		}
		return prodarr;
	}
	
	public void displayProduct(Product prodarr[]) {
		
		for(int i=0;i<prodarr.length;i++) {
			System.out.println(prodarr[i].getProId()+"\t"+prodarr[i].getProdName()+"\t"+prodarr[i].getProdPrice()+"\t"+prodarr[i].getProQty());
		}	
	}
}
