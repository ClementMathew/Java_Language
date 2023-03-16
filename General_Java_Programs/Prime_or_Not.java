
// Checking a Number Prime or Not

import java.util.Scanner;

class Prime_or_Not
{
    public static void main (String args[])
    {
        int i,num,count=0;
        Scanner user = new Scanner(System.in);
        System.out.println("Enter the number : ");
        num = user.nextInt();
        user.close();
        for(i=2;i<num;i++){
            if(num%i==0){
                count++;
            }
        }
        if(count>0){
            System.out.println(num+" is not a prime number");
        }
        else{
            System.out.println(num+" is a prime number");
        }
    }
}

