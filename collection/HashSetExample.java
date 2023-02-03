package collection;

import java.util.HashSet;

class Book
{
	int id;
	String name;
	String author;
	int Quntity;
	public Book(int id, String name, String author, int quntity) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.Quntity = quntity;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getAuthor() {
		return author;
	}
	public int getQuntity() {
		return Quntity;
	}
	
	
}
public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Book> set=new HashSet<>();
		set.add(new Book(101,"Let Us C","Kanetkar",8));
		set.add(new Book(102,"Data Communication","Forouzan",3));
		set.add(new Book(103,"OS","Galvin",6));
		for(Book b:set)
		{
			System.out.println("ID: "+b.getId());
			System.out.println("Book Name: "+b.getName());
			System.out.println("Author Name: "+b.getAuthor());
			System.out.println("Quantity: "+b.getQuntity());
			System.out.println("====================================");
		}
	}

}
