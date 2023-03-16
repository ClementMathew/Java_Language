
// Count Vowels in a Given String

import java.util.Scanner;

class String_Vowels_Count
{
    public static void main(String args[])
    {
        Scanner user = new Scanner (System.in);
        int i,n,count=0;
        String str;
        System.out.println("Enter the string : ");
        str = user.nextLine();
        user.close();
        n = str.length();
        for(i=0;i<n;i++){
            char ch = str.charAt(i);
            if(ch =='a'||ch == 'e'||ch == 'i'||ch == 'o'||ch == 'u'){
                count++;
            }
        }
        System.out.println("The total count of vowels is "+count);
    }
}
        