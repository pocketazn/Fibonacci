import java.util.Scanner;

public class fibonacci 
{
	public static void main(String[] args) 
	{
		int n = howMany();
		printFibonacci(n);
	}
	
	private static int howMany()
	{
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a Positive Integer: ");
		int number = reader.nextInt();
		if (number <= -1)
		{
			System.out.println("That is not a Positive Integer. ");
			return howMany();
		}
		return number;
	}
	
	private static void printFibonacci(int x)
	{
		int a = 0;
		int b = 1;
		int c = 0;
		int currentFibNum;
		
		while(c < x)
		{
			if( c == 0)
			{
				System.out.print("0 ");
				c++;
			}
			else 
			{
				if (c == 1)
				{
					System.out.print("1 ");
					c++;
				}
				else
				{
					currentFibNum = a + b;
					System.out.print(currentFibNum + " ");
					a = b;
					b = currentFibNum;
					c++;
				}
			}
		}
	}
	
}
