
// Arithmetic Exception Error 

import java.util.Scanner; 

class Error_Arithmetic_Exception
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
			System.out.println("Checking the first element prime or not");
			for(i=0;i<n;i++)
			{
				if(array[0]%i==0)
				{
					count++;
				}
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
