
// Factorial of a Number

import java.util.Scanner;

class Factorial_of_a_Number
{
    public static void main (String args[])
    {
        int i,num,fact=1;
        Scanner user = new Scanner (System.in);
        System.out.println("Enter the number to find factorial : ");
        num =user.nextInt();
        user.close();
        for(i=1;i<=num;i++){
            fact=fact*i;
        }
        System.out.println("The factorial of "+num+" is "+fact);
    }
}