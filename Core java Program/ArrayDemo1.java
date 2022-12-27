import java.util.Scanner;

public class ArrayDemo1
{
public static void main(String[] args)
{
int arr[]=new int[10];
System.out.println("Enter the number of elements:");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
for(int i=0;i<n;i++)
{
System.out.println("Enter the element:");
arr[i]=sc.nextInt();
}
System.out.println("Array the element are:");
for(int i=0;i<n;i++)
{
System.out.println(" "+arr[i]);
}
}
}