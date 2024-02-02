import java.util.Scanner;

public class booksMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Book id: ");
		int bookId=sc.nextInt();
		System.out.println("Enter Book Name: ");
		String bookName=sc.next();
		System.out.println("Enter Book Price");
		double bookPrice=sc.nextDouble();
		
		books obj= new books();
		obj.setBookId(bookId);
		obj.setBookName(bookName);
		obj.setBoookPrice(bookPrice);
		
		System.out.println("Book Id: "+obj.getBookId());
		System.out.println("Book Name: "+obj.getBookName());
		System.out.println("Book Price: "+obj.getBoookPrice());

	}

}
