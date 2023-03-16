
/* Write a Java program to create Sort class,the Attributes of this class is Array, and have member functions Getdata, Sort. 
Read the array using Getdata and sort it using sort function. */

import java.util.Scanner;

class Sort
{
    int Array[]=new int[100],n,i,j,temp;

    void Getdata()
    {
        try (Scanner user = new Scanner (System.in)) 
        {
            System.out.println("Enter the number of elements in array : ");
            n = user.nextInt();
            System.out.println("Enter the elements in the array : ");
            for(i=0;i<n;i++)
            {
                Array[i]=user.nextInt();
            }
            user.close();
        }
    }

    void Sort_1()
    {
        System.out.println("The sorted array is ");
        for(i=0;i<n-1;i++)
        {
            for(j=0;j<n-1;j++)
            {
                if(Array[j]>Array[j+1])
                {
                    temp=Array[j];
                    Array[j]=Array[j+1];
                    Array[j+1]=temp;
                }
            }
        }
        for(i=0;i<n;i++)
        {
            System.out.println(Array[i]);
        }
    }
}

class Sort_Array_Elements
{
    public static void main (String args[])
    {
        Sort A1 = new Sort();
        A1.Getdata();
        A1.Sort_1();
    }
}