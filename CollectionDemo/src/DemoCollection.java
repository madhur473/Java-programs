import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class DemoCollection {

	public static void main(String[] args) {
		
		List<Integer> arraylist= new ArrayList<Integer>();
		arraylist.add(new Integer(10));
		arraylist.add(20);
		arraylist.add(30);
		arraylist.add(40);
		arraylist.add(50);
		
		System.out.println("Array List is :"+arraylist);
		System.out.println("Search: "+arraylist.contains(10));
		System.out.println("get Element: "+arraylist.get(3));
		arraylist.remove(3);
		System.out.println("After Deleting");
		System.out.println("List is : "+arraylist);
		
		//Linked List
		List<Integer> linkedlist= new LinkedList<Integer>();
		linkedlist.add(new Integer(10));
		linkedlist.add(20);
		linkedlist.add(30);
		linkedlist.add(40);
		linkedlist.add(50);
		
		System.out.println("Array List is :"+linkedlist);
		System.out.println("Search: "+linkedlist.contains(10));
		System.out.println("get Element: "+linkedlist.get(3));
		linkedlist.remove(3);
		System.out.println("After Deleting");
		System.out.println("List is : "+linkedlist);
		
		//Set
		Set<Integer> treeset = new TreeSet<Integer>();
		treeset.add(20);
		treeset.add(32);
		treeset.add(21);
		treeset.add(99);
		treeset.add(10);
		System.out.println("Tree Set is :"+treeset);
		
		Set<Integer> hashset = new HashSet<Integer>();
		hashset.add(20);
		hashset.add(32);
		hashset.add(21);
		hashset.add(99);
		hashset.add(10);
		System.out.println("Tree Set is :"+hashset);
		
	}

}
