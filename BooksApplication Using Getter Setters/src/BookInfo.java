import java.util.Scanner;

public class BookInfo {
	
	public Books create() {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Book Id");
		int bookId=sc.nextInt();
		System.out.println("Enter book Name");
		String bookName=sc.next();
		System.out.println("Enter Book Price");
		int bookPrice=sc.nextInt();
		Books book=new Books(bookId, bookName, bookPrice);
		
		return book;
	}
	public void display(Books book) {
		System.out.println("Book Id: "+book.getBookId());
		System.out.println("Book Name: "+book.getBookName());
		System.out.println("Book Price: "+book.getBookPrice());

	}

}
