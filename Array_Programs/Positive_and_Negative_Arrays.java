
// Convert Given Array to Positive And Negative Number Arrays

import java.util.Scanner;

class Positive_and_Negative_Arrays
{
    public static void main (String args[])
    {
        try (Scanner user = new Scanner (System.in)) 
        {
            int i,j=0,k=0,n,Positive[] = new int[100], Negative[] = new int[100];
            System.out.println("Enter the number of elements in array : ");
            n = user.nextInt();
            int Array[] = new int[n];
            System.out.println("Enter the elements of the array : ");
            for(i=0;i<n;i++)
            {
                Array[i] = user.nextInt();
            }
            user.close();
            for(i=0;i<n;i++)
            {
                if(Array[i]>=0)
                {
                    Positive[j]=Array[i];
                    j++;
                }
                else
                {
                    Negative[k]=Array[i];
                    k++;
                }
            }
            System.out.println("The positive number array is : ");
            for(i=0;i<j;i++)
            {
                System.out.println(Positive[i]);
            }
            System.out.println("The negative number array is : ");
            for(i=0;i<k;i++)
            {
                System.out.println(Negative[i]);
            }
        }
    }
}