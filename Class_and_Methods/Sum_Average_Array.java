
// Sum and Average of Array Elements Using Class and Methods

import java.util.Scanner;

class Sum_Average
{
    int List[] = new int[100],n,i,Add=0,Average;

    void Getdata()
    {
        try (Scanner user = new Scanner (System.in)) 
        {
            System.out.println("Enter the number of elements : ");
            n=user.nextInt();
            System.out.println("Enter the elements : ");
            for(i=0;i<n;i++)
            {
                List[i] = user.nextInt();
            }
            user.close();
        }
    }

    void Sum()
    {
        System.out.println("The sum is ");
        for(i=0;i<n;i++)
        {
            Add+= List[i];
        }
        System.out.println(Add);
    }

    void Average()
    {
        System.out.println("The Average is ");
        Average = (Add/n);
        System.out.println(Average);
    }
}

class Sum_Average_Array
{
    public static void main (String args[])
    {
        Sum_Average A1 = new Sum_Average();
        A1.Getdata();
        A1.Sum();
        A1.Average();
    }
}