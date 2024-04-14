import java.util.Hashtable;
import java.util.Iterator;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		
		Vector<String> vectorobj=new Vector<String>();
		vectorobj.add("Java");
		vectorobj.add("Python");
		vectorobj.add("C#");
		vectorobj.add("SQL");
		
		System.out.println(vectorobj);
		System.out.println(vectorobj.firstElement());
		System.out.println(vectorobj.lastElement());
		
		vectorobj.remove(0);
		 Hashtable<String,Integer> htable=new Hashtable<String,Integer>();
		 htable.put("abc", 10000);
		 htable.put("xyz", 12000);
		 htable.put("pqr", 13000);
		 htable.put("abc", 70000);
		 System.out.println("---------------------------------------------------");
		 Iterator<String> itr=vectorobj.iterator();
		 while(itr.hasNext()) {
			 String s=itr.next();
			 
		 }
		 

		

	}

}
