//Setter Getter is  entity class
public class Product {
	
	private int proId;
	private String prodName;
	private double prodPrice;
	private int proQty;
	public Product(int proId, String prodName, double prodPrice, int proQty) {
		super();
		this.proId = proId;
		this.prodName = prodName;
		this.prodPrice = prodPrice;
		this.proQty = proQty;
	}
	public int getProId() {
		return proId;
	}
	public void setProId(int proId) {
		this.proId = proId;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public double getProdPrice() {
		return prodPrice;
	}
	public void setProdPrice(double prodPrice) {
		this.prodPrice = prodPrice;
	}
	public int getProQty() {
		return proQty;
	}
	public void setProQty(int proQty) {
		this.proQty = proQty;
	}
	

}
