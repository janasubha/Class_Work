
import java.util.Scanner;
public class ForEach
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int arr[]=new int[10];
int sum=0;
System.out.println("Enter the of elements:");
int n=sc.nextInt();
for(int i=0;i<n;i++)
{
System.out.println("Enter the elements:");
arr[i]=sc.nextInt();
}
for(int var:arr)
{
sum=sum+var;
}
System.out.println("sum of array elements:" +sum);
}
}