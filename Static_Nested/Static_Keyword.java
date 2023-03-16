
// Static Implementation

class Static_Keyword
{
    static int a = 3;
    static int b;
    
    static void show(int x)
    {
        System.out.println("x = "+x);
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }
    static
    {
        System.out.println("Static block Intialized");
        b = a * 4;
    }
    public static void main(String args[])
    {
        show(42);
    }
}