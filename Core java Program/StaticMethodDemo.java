import java.util.Scanner;

class Student1
{
	int id;
	String name;
	long phno;
	static String clgname="NIT";//static variable
	//static block
	static
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the college name: ");
		clgname=sc.nextLine();
	}
	//static method
	static void changeCollege()
	{
		clgname="SVU";
	}
	Student1(int i,String n,long p)
	{
		id=i;
		name=n;
		phno=p;
	}
	public void display()
	{
		System.out.println("id: "+id+"\n"+"name: "+name+"\n"+"phno: "+phno+"\n"+"College: "+clgname);
	}
	}
public class StaticMethodDemo {

	public static void main(String[] args) {
		Student1.changeCollege();
		Student1 s1=new Student1(1,"Rahul",7564892135l);
		s1.display();
		
		Student1 s2=new Student1(2,"Ram",7564892134l);
		s2.display();
		

	}

}