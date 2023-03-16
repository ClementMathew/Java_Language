
// Checking Amstrong Number or not

import java.util.Scanner;

class Amstrong_or_Not
{
    public static void main (String args[])
    {
        int num,temp,a,b=0;
        Scanner user = new Scanner(System.in);
        System.out.println("Enter the number : ");
        num = user.nextInt();
        temp = num;
        while(num>0)
        {
            a=num%10;
            b=b+(a*a*a);
            num=num/10;
        }
        if(b==temp)
        {
            System.out.println("its an amstrong number");
        }
        else
        {
            System.out.println("its not an amstrong number");
        }
        user.close();
    }
}