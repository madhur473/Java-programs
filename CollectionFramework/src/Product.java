
public class Product {
	private int prodId;
	private String prodName;
	private int Qty;
	private double price;
	public Product(int prodId, String prodName, int qty, double price) {
		super();
		this.prodId = prodId;
		this.prodName = prodName;
		Qty = qty;
		this.price = price;
	}
	public int getProdId() {
		return prodId;
	}
	public void setProdId(int prodId) {
		this.prodId = prodId;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public int getQty() {
		return Qty;
	}
	public void setQty(int qty) {
		Qty = qty;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	

}
