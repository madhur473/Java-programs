
public class ProductMain {

	public static void main(String[] args) {
		
		ShopInfo sinfo=new ShopInfo();
		Product pro []= sinfo.createProduct();
		sinfo.displayProduct(pro);
	}

}
