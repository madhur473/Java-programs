
public class ShopMain {

	public static void main(String[] args) {
		
		ShopInfo sinfo= new ShopInfo();
		Customer cust=sinfo.createProduct();
		Bill billobj=sinfo.calculateBill(cust);
		sinfo.displayProduct(cust, billobj);
		
	}

}
