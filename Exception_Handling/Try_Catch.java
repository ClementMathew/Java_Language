
// Try Catch Familiarisation - Exception Handling

import java.util.Scanner;

class Try_Catch
{
	public static void main(String args[])
	{
		int count=0;
		try (Scanner user = new Scanner(System.in)) 
		{
			int array[] = new int[5];
			int n,i;
			System.out.println("Enter the number of elements : ");
			n=user.nextInt();
			System.out.println("Enter the elements : ");
			for(i=0;i<n;i++)
			{
				array[i] = user.nextInt();
			}
			user.close();
			System.out.println("Checking the first element prime or not");
			try
			{
				for(i=0;i<n;i++)
				{
					if(array[0]%i==0)
					{
						count++;
					}
				}
			}
			catch(ArithmeticException e)
			{
				System.out.println("---Arithmetic Error Detected---");
			}
		}
		if(count>0)
		{
			System.out.println("This is prime");
		}
		else
			System.out.println("This is not prime");
	}
}
