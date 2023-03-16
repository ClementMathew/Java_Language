
// Second Largest Element in an Array

import java.util.Scanner;

class Largest_Among_Three
{
    public static void main(String args[])
    {
        int a,b,c;
        Scanner user = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        a=user.nextInt();
        System.out.println("Enter the Second number : ");
        b=user.nextInt();
        System.out.println("Enter the third number : ");
        c=user.nextInt();
        if( a>b && a>c ){
            System.out.println(a+" is greater");
        }
        else if( b>c && b>a ){
            System.out.println(b+" is greater");
        }
        else{
            System.out.println(c+" is greater");
        }
        user.close();
    }
}