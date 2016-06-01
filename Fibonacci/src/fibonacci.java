import java.util.Scanner;

public class fibonacci 
{
	public static void main(String[] args) 
	{
		int n = howMany();
		printFibonacci(n);
	}
	
	// Reads in a Positive Integer when called and returns said Integer
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
	
	//Reads in a Positive integer and provides a list from 0 to the positive Integer 
	//list of the Fibonacci Chain
	private static void printFibonacci(int x)
	{
		if(x < 0)
		{
			System.out.println("Error: Negative Number Given");
		}
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
