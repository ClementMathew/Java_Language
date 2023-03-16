
// Familiarising Throw and Throws

import java.util.Scanner;

class Error
{
		Scanner user = new Scanner(System.in);
		int array[] = new int[5];
		int n,i,count=0;
		
		void Read()
		{
			System.out.println("Enter the number of elements : ");
			n=user.nextInt();
			System.out.println("Enter the elements : ");
			for(i=0;i<n;i++)
			{
				array[i] = user.nextInt();
			}
		}
		void Check() throws ArithmeticException
		{
			System.out.println("Checking the first element prime or not");
			for(i=0;i<n;i++)
			{
				if(array[0]%i==0)
				{
					count++;
				}
			}
			throw new ArithmeticException ("I am the compiler");
		}
}

class Throw_And_Throws
{
	public static void main(String args[])
	{
		Error A1 = new Error();
		A1.Read();
		try
		{
			A1.Check();
		}
		catch(ArithmeticException e)
		{
			System.out.println("---Error Detected---");
		}
	}
}
