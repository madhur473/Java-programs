package linkcode.shop.model;

import java.util.Date;

public class Bill {
	
	private int billNumber;
	private Date billDate;
	private float total;
	private float cgst;
	private float sgst;
	private float finalTotal;
	
	public Bill() {	
	}

	public Bill(int billNumber, Date billDate, float total, float cgst, float sgst, float finalTotal) {
		super();
		this.billNumber = billNumber;
		this.billDate = billDate;
		this.total = total;
		this.cgst = cgst;
		this.sgst = sgst;
		this.finalTotal = finalTotal;
	}

	public int getBillNumber() {
		return billNumber;
	}

	public void setBillNumber(int billNumber) {
		this.billNumber = billNumber;
	}

	public Date getBillDate() {
		return billDate;
	}

	public void setBillDate(Date billDate) {
		this.billDate = billDate;
	}

	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}

	public float getCgst() {
		return cgst;
	}

	public void setCgst(float cgst) {
		this.cgst = cgst;
	}

	public float getSgst() {
		return sgst;
	}

	public void setSgst(float sgst) {
		this.sgst = sgst;
	}

	public float getFinalTotal() {
		return finalTotal;
	}

	public void setFinalTotal(float finalTotal) {
		this.finalTotal = finalTotal;
	}

}
