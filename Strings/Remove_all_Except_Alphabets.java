
// Remove all Characters Except Alphabets

import java.util.Scanner;

class Remove_all_Except_Alphabets
{
    public static void main (String args[])
    {
        Scanner user = new Scanner (System.in);
        int i,n;
        String Str,Modified ="";
        System.out.println("Enter the String : ");
        Str = user.nextLine();
        n = Str.length();
        user.close();
        System.out.println("The Modified String is ");
        for(i=0;i<n;i++){
            if(Str.charAt(i)>='a' && Str.charAt(i)<='z'){
                Modified+=Str.charAt(i);
            }
        }
        System.out.println(Modified);
    }
}