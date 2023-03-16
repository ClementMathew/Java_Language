
// Array Index Out of Bounds Error

import java.util.Scanner; 

class Error_Array_Index_out_of_Bound
{
	public static void main(String args[])
	{
		try (Scanner user = new Scanner(System.in)) 
		{
			int array[] = new int[5];
			int n,i;
			System.out.println("Enter the number of elements : ");
			n=user.nextInt();
			System.out.println("Enter the elements : ");
			for(i=0;i<=n+6;i++)
			{
				array[i] = user.nextInt();
			}
			user.close();
		}
	}
}
