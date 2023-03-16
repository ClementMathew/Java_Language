
// Nested Try Catch Also With Final

import java.util.Scanner; 

class Nested_Try_Catch_With_Finally
{
	public static void main(String args[])
	{
		try (Scanner user = new Scanner(System.in)) 
		{
			int array[] = new int[5];
			int n,i,count=0;
			System.out.println("Enter the number of elements : ");
			n=user.nextInt();
			System.out.println("Enter the elements : ");
			try
			{
				try
				{
					for(i=0;i<=n+6;i++)
					{
						array[i] = user.nextInt();
					}
					System.out.println("Checking the first element prime or not");
				}
				catch(ArrayIndexOutOfBoundsException e1)
				{
					System.out.println("------Out of Bound Error Detected-------");
				}
				for(i=0;i<n;i++)
				{
					if(array[0]%i==0)
					{
							count++;
					}
				}
			}
			catch(ArithmeticException e2)
			{
				System.out.println("-----Arithmetic Error Detected ------");
			}
			finally
			{
				if(count>0)
					System.out.println("This is prime");
				else
					System.out.println("This is not prime");
			}
		}
	}
}
