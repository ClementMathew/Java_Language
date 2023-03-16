
// Second Largest Element in an Array

import java.util.Scanner;

class Second_Largest_in_Array
{
    public static void main (String args[])
    {
        int i,j,n,temp;
        try (Scanner user = new Scanner(System.in)) 
        {
            System.out.println("Enter the number of elements in the array : ");
            n = user.nextInt();
            int array[] = new int [n];
            System.out.println("Enter the elements of array : ");
            for(i=0;i<n;i++)
            {
                array[i]=user.nextInt();
            }
            user.close();
            for(i=0;i<n-1;i++)
            {
                for(j=0;j<n-i-1;j++)
                {
                    if(array[j]>array[j+1])
                    {
                        temp=array[j];
                        array[j]=array[j+1];
                        array[j+1]=temp;
                    }
                }
            }
            System.out.println("The Second largest element is "+array[n-2]);
        }
    }
}