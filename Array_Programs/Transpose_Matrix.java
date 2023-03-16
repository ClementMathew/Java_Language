
// Taking Transpose of a Given Matrix

import java.util.Scanner;

class Transpose_Matrix
{
    public static void main(String args[])
    {
        int i,j,row,colmn;
        Scanner user = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns : ");
        row = user.nextInt();
        colmn = user.nextInt();
        int matrix[][] = new int[row][colmn];
        System.out.println("Enter the elements of the matrix : ");
        for(i=0;i<row;i++)
        {
            for(j=0;j<colmn;j++)
            {
                matrix[i][j]=user.nextInt();
            }
        }
        System.out.println("Transpose of the matrix is : ");
        for(i=0;i<row;i++)
        {
            for(j=0;j<colmn;j++)
            {
                System.out.print("\t"+matrix[j][i]);
            }
            System.out.print("\n");
        }
        user.close();
    }
}