
public class Product {
	private int prodId;
	private String prodName;
	private double prodPrice;
	private int proQty;
	
	public Product(int prodId, String prodName, double prodPrice, int proQty) {
		super();
		this.prodId = prodId;
		this.prodName = prodName;
		this.prodPrice = prodPrice;
		this.proQty = proQty;
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
