
// Decimal to Octal Convert Program

import java.util.*;

class Decimal_To_Octal 
{
    static void Conversion(int n)
    {
        int[] octal = new int[100];
        int i = 0;
        while (n != 0) 
        {
            octal[i] = n % 8;
            n = n / 8;
            i++;
        }
        System.out.println("The octal number is ");
        for (int j = i - 1; j >= 0; j--)
        {
            System.out.print(octal[j]);
        }
    }

    public static void main(String[] args)
    {
        try (Scanner user = new Scanner(System.in)) 
        {
            int n;
            System.out.println("Enter the number to convert : ");
            n = user.nextInt();
            Conversion(n);
        }
    }
}