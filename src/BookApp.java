
public class BookApp {

	public static void main(String[] args) {
		BookDatabase books = new BookDatabase();
		books.store();
		System.out.println(books.getBookBySku("Rasp1006").toString());

	}

}
