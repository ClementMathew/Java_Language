
// Displaying Multiplication Table Upto 12

import java.util.Scanner;

class Multiplication_Table
{
    public static void main (String args[])
    {
        int n,i;
        Scanner user = new Scanner(System.in);
        System.out.println("Enter the number for multiplication table : ");
        n = user.nextInt();
        user.close();
        System.out.println("The multiplication table is : ");
        for(i=1;i<=12;i++){
            System.out.println(n+"*"+i+"="+(n*i));
        }
    }
}