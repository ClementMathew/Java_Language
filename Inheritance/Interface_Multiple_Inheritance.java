
// Multiple Inheritance with implements only

interface Printable
{
    void print();
}
interface Showable
{
    void print();
}
public class Interface_Multiple_Inheritance
{
    public void print()
    {
        System.out.println("Implementation Successfull");
    }
    public static void main(String args[])
    {
        Interface_Multiple_Inheritance obj = new Interface_Multiple_Inheritance();
        obj.print();
    }
}