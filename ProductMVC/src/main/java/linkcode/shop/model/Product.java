package linkcode.shop.model;

public class Product {
	
	private int prodId;
	private String pName;
	private int prodQty;
	private int prodPrice;
	
	
	public Product() {
		
	}
	public Product(int prodId, String pName, int prodQty, int prodPrice) {
		super();
		this.prodId = prodId;
		this.pName = pName;
		this.prodQty = prodQty;
		this.prodPrice = prodPrice;
	}
	public int getProdId() {
		return prodId;
	}
	public void setProdId(int prodId) {
		this.prodId = prodId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public int getProdQty() {
		return prodQty;
	}
	public void setProdQty(int prodQty) {
		this.prodQty = prodQty;
	}
	public int getProdPrice() {
		return prodPrice;
	}
	public void setProdPrice(int prodPrice) {
		this.prodPrice = prodPrice;
	}
	
	
	
	

}
