
// Octal to Decimal Convert Program

import java.util.Scanner;

class Convert_8_to_10
{
    void Conversion() 
    {
        int num,i=0,temp,decimal=0;
        try (Scanner user = new Scanner(System.in)) 
        {
            System.out.println("Enter the number to convert to decimal : ");
            num = user.nextInt();
        }
        while(num != 0)
        {
            temp = num % 10;
            decimal += temp*Math.pow(8,i);
            num = num/10;
            i++;
        }
        System.out.println("The octal number in decimal is : "+ decimal);
    }
}
class Octal_To_Decimal
{
    public static void main(String[] args) 
    {
        Convert_8_to_10 obj = new Convert_8_to_10();
        obj.Conversion();
    }
}