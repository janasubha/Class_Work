
class Emp
{

	int emp_id;
	String emp_name;
	long emp_phno;
	int salary;
	
	public void setData(int id,String name,long ph,int sal)
	{
		emp_id=id;
		emp_name=name;
		emp_phno=ph;
		salary=sal;
	}
	public void getData()
	{
		System.out.println("Id: "+emp_id+"\n"+"Name: "+emp_name+"\n"+"emp_phno: "+emp_phno+"\n"+"Salary: "+salary);
	}
	
}
public class ClassDemo {

	public static void main(String[] args) {
		Emp e1=new Emp();
		e1.setData(101, "suvankar",7563872448l, 10000);
		e1.getData();

	}

}