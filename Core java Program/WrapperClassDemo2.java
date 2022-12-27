
public class WrapperClassDemo2{
public static void main(String[] args)
{
int a=30;
// converting int(primitive) to integer(object)
Integer i=Integer.valueOf(a);
System.out.println(i);
//autoboxing now compiler will autometically convert
Integer i1=a;
System.out.println(i1);
// converting Integer to int
Integer in=new Integer(60);
int c=in.intValue();
System.out.println(c);
// unboxing int to Integer
int j=in;
System.out.println(j);
}

}