
// Area of Rectangle Using Seperate Methods

import java.util.Scanner;

class Area_User
{
    int Length,Width;

    void Getdata()
    {
        Scanner user = new Scanner (System.in);
        System.out.println("Enter Length : ");
        Length = user.nextInt();
        System.out.println("Enter Width : ");
        Width = user.nextInt();
        user.close(); 
    }

    void Find()
    {
        int A;
        A = Length*Width;
        System.out.println("Area is "+A);
    }
}

class Area_Rectangle_User
{
    public static void main (String args[])
    {
        Area_User A1 = new Area_User();
        A1.Getdata();
        A1.Find();
    }
}