
// Write a java program to find the frequency of given character in a string

import java.util.Scanner;

class Frequency_Given_Char 
{
    public static void main(String args[])
    {
        Scanner user = new Scanner (System .in);
        System.out.println("Enter the string : ");
        String str = user.nextLine();
        System.out.println("Enter the character : ");
        int count = 0;
        char character = user.next().charAt(0);
        user.close();
 
        for(int i=0;i<str.length();i++)
        {
            if(character == str.charAt(i))
            {
                count++;
            }
        }
        System.out.println("Frequency of the given character is "+count);
    }       
}