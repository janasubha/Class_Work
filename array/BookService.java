package array;

import java.util.Scanner;

public class BookService {
	static Book book[]=new Book[10];//array of book type
	static Scanner sc=new Scanner(System.in);
	static int index=0;
	//create book method
	public void createBook()
	{
		int id;
		String bname;
		double price;
		System.out.println("enter the book Id: ");
		id=sc.nextInt();
		sc.nextLine();
		System.out.println("enter the book name: ");
		bname=sc.nextLine();
		System.out.println("enter the price: ");
		price=sc.nextDouble();
		book[index]=new Book(id,bname,price);
		index++;
		System.out.println("Book added successfully");
	}
	//get all book details
	public static void getAllBookDetails()
	{
		for(int i=0;i<index;i++)
		{
			System.out.println("Book Id: "+book[i].getBookId());
			System.out.println("Book Name: "+book[i].getBookName());
			System.out.println("Book Price: "+book[i].getBookPrice());
			System.out.println("===============================");
		}
	}
		//get book details based on id
		public static void searchById()
		{
			System.out.println("Enter the book id: ");
			int sid=sc.nextInt();
			int i;
			for(i=0;i<index;i++)
			{
				if(book[i].getBookId()==sid)
				{
					System.out.println("Book Id: "+book[i].getBookId());
					System.out.println("Book Name: "+book[i].getBookName());
					System.out.println("Book Price: "+book[i].getBookPrice());
					System.out.println("===============================");
					break;
				}
				
			}
			
			if(i==index)
				System.out.println("book not found");
		}
		public static void UpdateById() {
			// TODO Auto-generated method stub
			int i,id,id1;
			double price;
			String name1;
			System.out.println("Enter the id of book for update");
			id=sc.nextInt();
			for(i=0;i<index;i++)
			{
			if(book[i].getBookId()==id)
			{
				System.out.println("Enter the update Id");
				id1=sc.nextInt();
				System.out.println("Enter the update name");
				name1=sc.nextLine();
				sc.nextLine();
				System.out.println("Enter the update price");
				price=sc.nextDouble();
				book[i]=new Book(id1,name1,price);
				System.out.println("Book has been update successfully");
			}
		}
			if(i==index)
				System.out.println("book not found");	
		}
	

}