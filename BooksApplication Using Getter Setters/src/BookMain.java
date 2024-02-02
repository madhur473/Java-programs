
public class BookMain {

	public static void main(String[] args) {
		BookInfo bobj = new BookInfo() ;
		Books book =bobj.create();
		bobj.display(book);
		
	}
}