class User
{
	int id;
	String name;
	String address;
	public User(int id,String name,String address)
	{
		this.id=id;
		this.name=name;
		this.address=address;
	}
	public void display()
	{
		System.out.println("id: "+id+"\n"+"name: "+name+"\n"+"Address: "+address);
	}
	}
class Employee extends User
{
	double salary;
	String designation;
	public Employee(int id,String name,String address,double salary,String designation)
	{
		super(id,name,address);
		this.salary=salary;
		this.designation=designation;
	}
	public void getData()
	{
		super.display();
		System.out.println("Salary:"+salary);
		System.out.println("Designation: "+designation);
	}
	}
public class SingleInheritanceDemo {

	public static void main(String[] args) {
		Employee emp1=new Employee(101,"suvankar","Kolkata",30000,"SW");
		emp1.getData();

	}

}