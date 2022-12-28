package array;

import java.util.Scanner;

public class BookMain {

	public static void main(String[] args) {
		int ch;
		Scanner sc=new Scanner(System.in);
		BookService bservice=new BookService();
		System.out.println("Welcome to book Management System");
		do {
			System.out.println("\n1.createBook\n2.get book by id\n3.getallbook\n4.updatebyid\n5.exit");
			ch=sc.nextInt();
			switch (ch) {
			case 1:
				bservice.createBook();
				break;
			case 2:
				BookService.searchById();
				break;
			case 3:
				BookService.getAllBookDetails();
				break;
			case 4:
				BookService.UpdateById();
				break;
			case 5:
				System.exit(0);
			}
			System.out.println("Thanks for visit us");
		}while(true);

	}

}