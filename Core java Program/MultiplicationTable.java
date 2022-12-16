import java.util.Scanner;  

public class MultiplicationTable 
{  
public static void main(String args[])   
{  
Scanner sc = new Scanner(System.in);  
System.out.print("Enter number: ");       
//reading a number whose table is to be print  
int num=sc.nextInt();  

for(int i=1; i <= 10; i++)  
{  
//prints table of the entered number      
System.out.println(num+" * "+i+" = "+num*i);  
}  
}  
}  