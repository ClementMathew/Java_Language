
// Reading values from user and finding sum

import java.util.Scanner;

class Sum_of_array_user
{
	public static void main (String args[])
	{
		int sum=0,i,num;
		try (Scanner user = new Scanner(System.in)) 
		{
			System.out.println("Enter the number of elements : ");
			num =user.nextInt();
			int array[]= new int[num];
			System.out.println("Enter the elements : ");
			for(i=0;i<num;i++)
			{
				array[i]=user.nextInt();	
			}
			user.close();
			System.out.println("The sum of elements is : ");
			for(i=0;i<num;i++)
			{
				sum+=array[i];
			}
		}
		System.out.println(sum);
	}
}