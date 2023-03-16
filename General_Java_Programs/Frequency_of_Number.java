
// Frequency count of a number in a given number 

import java.util.Scanner;

class Frequency_of_Number
{
    public static void main (String args[])
    {
        Scanner user = new Scanner (System.in);
        int num,n,a,count=0;
        System.out.println("Enter the number : ");
        num = user.nextInt();
        System.out.println("Enter the digit to find frequency : ");
        n = user.nextInt();
        user.close();
        while(num!=0){
            a=num%10;
            if(a==n){
                count++;
            }
            num=num/10;
        }
        System.out.println("The frequency is "+count);
    }
}