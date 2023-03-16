
// Convert Decimal Number to Binary

import java.util.Scanner;

class Convert_Decimal_to_Binary
{
    public static void main (String args[])
    {
        int Binary=0;
        try (Scanner user = new Scanner (System.in)) 
        {
            int num,rem,i=1;
            System.out.println("Enter the number to convert : ");
            num = user.nextInt();
            while(num!=0)
            {
                rem=num%2;
                Binary+=(rem*i);
                num=num/2;
                i=i*10;
            }
        }
        System.out.println("The Binary number is : "+Binary);
    }
}