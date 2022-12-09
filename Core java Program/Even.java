
import java.util.Scanner;
public class Even
{	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter n value: ");
		int n = input.nextInt();
		System.out.println("Even numbers in the range 1 - " + n + " are: ");
		for(int i = 2; i <= n; i = i + 2)
			System.out.println(i + " ");
		
	}
}