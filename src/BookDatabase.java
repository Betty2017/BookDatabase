import java.util.ArrayList;

public class BookDatabase {

	
	String sku;
	ArrayList <Book> books = new ArrayList<Book>();
	public void store() 
	{
		
		Book b = new Book();
		b.setSku("Java1001");
		b.setTitle("Head First Java");
		b.setAuthor("Kathy Sierra and Bert Bates");
		b.setDescription("Easy to read Java workbook");
		b.setPrice(47.50);
		books.add(b);
		books.set(0,b);
		
		Book c = new Book();
		c.setSku("Java1002");
		c.setTitle("Thinking in Java");
		c.setAuthor("Bruce Eckel");
		c.setDescription("Details about Java under the hood");
		c.setPrice(20.00);
		books.add(c);
		books.set(1,b);
		
		Book d = new Book();
		d.setSku("Orcl1003");
		d.setTitle("OCP: Oracle Certified Professional Java SE");
		d.setAuthor("Jeanne Boyarsky");
		d.setDescription("Everything you need to know in one place");
		d.setPrice(45.00);
		books.add(d);
		books.set(2,d);
		
		Book e = new Book();
		e.setSku("Python1004");
		e.setTitle("Automate the Boring Stuff with Python");
		e.setAuthor("Al Sweigart");
		e.setDescription("Fun with Python");
		e.setPrice(10.50);
		books.add(e);
		books.set(3,e);
	
		Book f = new Book();
		f.setSku("Rasp1006");
		f.setTitle("Raspberry Pi Projects for the Evil Genius");
		f.setAuthor("Donald Norris");
		f.setDescription("A dozen fiendishly fun projects for the Raspberry Pi!");
		f.setPrice(14.75);
		books.add(f);
		books.set(4,f);
		
	}
		
		public Book getBookBySku(String sku){
		this.sku = sku;
		int index = 0;
		
		switch (sku){
			case "Java1001": index = 0;
			break;
			case "Java1002": index = 1;
			break;
			case "Orcl1003": index = 2;
			break;
			case "Python1004": index = 3;
			break;
			case "Rasp1006": index = 4;
			break;
		}
			return books.get(index);
		}		
	}

