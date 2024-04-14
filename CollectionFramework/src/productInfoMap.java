

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Set;


public class productInfoMap {
	public Map<String,List<Product>> accept(){
		Scanner sc= new Scanner(System.in);
		Map<String ,List<Product>> hashMap= new HashMap<String,List<Product>>();
		String str=null;
		String str2=null;
		
		do
		{
			System.out.println("enter Next Key");
			String key=sc.next();
			List<Product> lstproduct =new ArrayList<Product>();
			do
			{
				System.out.println("Enter "+key+" Details");
				System.out.println("Enter "+key+" Id");
				int prodId=sc.nextInt();
				System.out.println("Enter "+key+" Name");
				String prodName=sc.next();
				System.out.println("Enter "+key+" Qty");
				int proQty=sc.nextInt();
				System.out.println("Enter "+key+" Price");
				double prodPrice=sc.nextDouble();
				
				Product prod=new Product(prodId, prodName, proQty, prodPrice);
				lstproduct.add(prod);
				System.out.println("Do you want to add next "+key+" details press yes/no");
				str=sc.next();
			}while(str.equals("yes"));
			hashMap.put(key, lstproduct);
			System.out.println("Do you want to add next Product key press yes/no");
			str2=sc.next();
		}while(str2.equals("yes"));
		return hashMap;
	}
	public void display(Map<String,List<Product>> hashMap) {
		Set<String> productSet=hashMap.keySet();
		for(String s:productSet) {
			List<Product> lstproduct=hashMap.get(s);
			for(Product prod:lstproduct)
			{
				System.out.println(prod.getProdId()+"\t"+prod.getProdName()+"\t"+prod.getQty()+"\t"+prod.getPrice());
			}
		}
	}
}

