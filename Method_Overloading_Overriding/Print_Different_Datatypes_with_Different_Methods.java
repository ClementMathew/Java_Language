
/* Create a class named 'PrintNumber' to print various numbers of different datatypes by creating different methods 
   with the same name 'printn' having a parameter for each datatype. */

class PrintNumber
{
    void printn(int a)
    {
        System.out.println(a);
    }
    
    void printn(float b)
    {
        System.out.println(b);
    }
    
    void printn(double c)
    {
        System.out.println(c);
    }
    
    void printn(String d)
    {
        System.out.println(d);
    }
}

class Print_Different_Datatypes_with_Different_Methods
{
    public static void main(String[] args)
    {
        PrintNumber A1 = new PrintNumber();
        A1.printn("Clement");
        A1.printn(9.23);
        A1.printn(0.2221);
        A1.printn(25);
    }  
}