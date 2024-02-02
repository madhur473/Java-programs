import java.util.Date;
import java.util.Scanner;

public class ShopInfo {
	public Customer createProduct() {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Customer ID: ");
		int custId=sc.nextInt();
		System.out.println("Enter Customer Name: ");
		String custName=sc.next();
		System.out.println("Enter Customer Mobile Number: ");
		String mobileNumber =sc.next();
		
		System.out.println("Enter City: ");
		String city =sc.next();
		System.out.println("Enter State: ");
		String state=sc.next();
		System.out.println("Enter Pincode: ");
		int pincode=sc.nextInt();
		
		Address address =new Address (city,state,pincode);
		System.out.println("How many product do you want");
		int n=sc.nextInt();
		Product prodArr[]=new Product [n];
		for(int i=0;i<prodArr.length;i++)
		{
			System.out.println("----------------ENTER PRODUCT "+(i+1)+"Details");
			System.out.println("Enter product Id");
			int prodId=sc.nextInt();
			System.out.println("Enter product Name");
			String prodName=sc.next();
			System.out.println("Enter product Price");
			double prodPrice=sc.nextDouble();
			System.out.println("Enter product qty");
			int prodQty=sc.nextInt();
			Product prodobj=new Product(prodId,prodName,prodPrice,prodQty);
			prodArr[i]=prodobj;
		}
		Customer custobj=new Customer(custId,custName,mobileNumber,address,prodArr);
		return custobj;
	}
	public void displayProduct (Customer cust, Bill billobj) {
		System.out.println("Customer Id : "+cust.getCustId());
		System.out.println("Customer Name : "+cust.getCustName());
		System.out.println("Mobile No : "+cust.getMobNumber());
		System.out.println("------ADDRESS------");
		System.out.println("City : "+cust.getAddr().getCity());
		System.out.println("State : "+cust.getAddr().getState());
		System.out.println("Pincode : "+cust.getAddr().getPincode());
		System.out.println("-------PRODUCT LIST------");
		Product prodArr[]=cust.getProdArr();
		for (int i=0;i<prodArr.length;i++)
		{
		System.out.println(prodArr[i].getProdId()+"\t"+prodArr[i].getProdName()+"\t"+prodArr[i].getProdPrice()+"\t");
		}
		System.out.println("-BILL DETAILS-");
		System.out.println("Bill Number : "+billobj.getBillNumber());
		System.out.println("Date : "+billobj.getDate());
		System.out.println("Total : "+billobj.getTotal());
		System.out.println("CGST : "+billobj.getCgst());
		System.out.println("SGST : "+billobj.getSgst());
		System.out.println("Final Total : "+billobj.getFinalTotal());
		System.out.println("--------- THANK YOU-------------");
	}
		public Bill calculateBill(Customer cust) {
		double total=0;
		double cgst;
		double sgst;
		double finalTotal;
		Product prodArr[]=cust.getProdArr();
		for(int i=0;i<prodArr.length;i++)
		{
			total=total+(prodArr[i].getProdPrice()*prodArr[i].getProdQty());
		}
	
		cgst=total*0.06;
		sgst=total*0.06;
		finalTotal=total+cgst+cgst;
		Bill billobj=new Bill(1, new Date(), total, cgst, sgst, finalTotal);
		return billobj;
		}
}
