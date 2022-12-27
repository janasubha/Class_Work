
public class WrapperClassDemo1{
public static void main(String[] args)
{
int a=30;
// converting int(primitive) to integer(object)
Integer i=Integer.valueOf(a);
System.out.println(i);
//autoboxing now compiler will autometically convert
Integer i1=a;
System.out.println(i1);

}

}