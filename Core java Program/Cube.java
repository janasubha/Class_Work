import java.util.Scanner;
public class Cube
{
	public static void main(String[] args)
	{
		
		int n,i;

		
		System.out.print("Enter the last number for cube : ");
		Scanner Sc= new Scanner(System.in);
		
		n = Sc.nextInt();

		for(i=1;i<=n;i++)
		{
			System.out.println("Cube of " +i+" is : "+(i*i*i));     
		}
	}
}