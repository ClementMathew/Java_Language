
// Familiarising Finally and Try Catch

import java.util.Scanner; 

class Try_Catch_Finally
{
	public static void main(String args[])
	{
		try (Scanner user = new Scanner(System.in)) 
		{
			int array[] = new int[5];
			int n,i,count = 0;
			System.out.println("Enter the number of elements : ");
			n = user.nextInt();
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
				System.out.println("---Error Detected---");
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
