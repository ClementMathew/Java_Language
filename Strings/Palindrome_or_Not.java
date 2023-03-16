
// Checking a String Palindrome or Not

import java.util.Scanner;

class Palindrome_or_Not
{
    public static void main (String args[])
    {
        int n,i,count=0;
        try (Scanner user = new Scanner(System.in)) 
        {
            char string[] = new char[100];
            System.out.println("Enter the length of the string : ");
            n = user.nextInt();
            System.out.println("Enter the string : ");
            for(i=0;i<n;i++)
            {
                string[i]=user.next().charAt(0);
            }
            user.close();
            for(i=0;i<n;i++)
            {
                if(string[i]!=string[n-1-i])
                {
                    count++;
                }
            }
        }
        if(count>0)
        {
            System.out.println("The String is not a palindrome");
        }
        else
        {
            System.out.println("The String is a palindrome");
        }
    }
}