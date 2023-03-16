
// Second Largest Element in Array Using Class and Objects

import java.util.Scanner;

class Second_Largest
{
    int i,j,n,temp, array[] = new int [100];

    void Getdata()
    {
        try (Scanner user = new Scanner(System.in)) 
        {
            System.out.println("Enter the number of elements in the array : ");
            n = user.nextInt();
            System.out.println("Enter the elements of array : ");
            for(i=0;i<n;i++)
            {
                array[i]=user.nextInt();
            }
            user.close();
        }
    }

    void Display()
    {
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(array[i]>array[j])
                {
                    temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
        System.out.println("The Second largest element is "+array[n-2]);
    }
}

class Second_Largest_in_Array_Class_and_Methods
{
    public static void main (String args[])
    {
        Second_Largest A1 = new Second_Largest();
        A1.Getdata();
        A1.Display();
    }
}