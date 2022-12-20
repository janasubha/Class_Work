
class Addition
{
public void Add(int a)
{
System.out.println("Addition value of one parameter:" +(a+10));
}
public void Add(int a,int b,int c)
{
System.out.println("Addition value of three parameter:" +(a+b+c));
}
public void Add(int a,double b)
{
System.out.println("Addition value of parameter(int,double):" +(a+b));
}
public void Add(double a,int b)
{
System.out.println("Addition value of  parameter(double,int):" +(a+b));
}
}

public class MethodOverloading
{
public static void main(String[] args)
{

Addition ad=new Addition();
ad.Add(12, 45, 10);
ad.Add(100);
ad.Add(12.3, 5);
ad.Add(56, 50.8);

}
}