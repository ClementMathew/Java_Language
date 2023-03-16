
// Convert Binary to Decimal Number

import java.util.Scanner;

class Binary_To_Decimal
{    
    static void Conversion(int num)
    {  
        int decimal = 0, i = 0;  
        while(num != 0)
        {  
            int temp = num % 10;  
            decimal += temp*Math.pow(2, i);  
            num = num/10;  
            i++;  
        }
        System.out.println("The decimal number is "+ decimal);
    }  
    public static void main(String args[])
    {    
        int n;
        try (Scanner user = new Scanner(System.in)) 
        {
            System.out.println("Enter the number to convert : ");
            n = user.nextInt();
        }
        Conversion(n);
    }
}    