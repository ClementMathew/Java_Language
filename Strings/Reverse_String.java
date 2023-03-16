
// Reverse a string

import java.util.Scanner;

class Reverse_String
{
    public static void main(String args[]) 
    {
        Scanner user = new Scanner(System.in);
        int i,n;
        String original,reverse="";
        System.out.println("Enter  a String to reverse it : ");
        original = user.nextLine();
        user.close();
        n=original.length();
        for(i=n-1;i>=0;i--){
            reverse+=original.charAt(i);
        }
        System.out.println("The reversed string is ");
        for(i=0;i<n;i++){
            System.out.print(reverse.charAt(i));
        }
    }
}