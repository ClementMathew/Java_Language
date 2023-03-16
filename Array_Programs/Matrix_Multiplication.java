
// Multiplication of Two Matrices

import java.util.Scanner;

class Matrix_Multiplication
{
    public static void main(String args[])
    {
        int i,j,k,r1,r2,c2,c1,Multiply[][] = new int[100][100];
        Scanner user = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of first matrix : ");
        r1 = user.nextInt();
        c1 = user.nextInt();
        int First[][] = new int[r1][c1];
        System.out.println("Enter the elements of first matrix : ");
        for(i=0;i<r1;i++)
        {
            for(j=0;j<c1;j++)
            {
                First[i][j]=user.nextInt();
            }
        }
        System.out.println("Enter the number of rows and columns of second matrix : ");
        r2 = user.nextInt();
        c2 = user.nextInt();
        int Second[][] = new int[r2][c2];
        System.out.println("Enter the elements of second matrix : ");
        for(i=0;i<r2;i++)
        {
            for(j=0;j<c2;j++)
            {
                Second[i][j]=user.nextInt();
            }
        }
        if(c1!=r2)
        {
            System.out.println("Matrix multiplication is not possible");
        }
        else
        {
            System.out.println("The multiplied matrix is : ");
            for(i=0;i<r1;i++)
            {
                for(j=0;j<c2;j++)
                {
                    Multiply[i][j]=0;
                    for(k=0;k<r2;k++)
                    {
                        Multiply[i][j]+=First[i][k]*Second[k][j];
                    }
                    System.out.print(Multiply[i][j]+"\t");
                }
                System.out.print("\n");
            }
        }
        user.close();
    }
}