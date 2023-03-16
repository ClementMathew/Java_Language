
// Non Static Nested Class

class Outer
{
    int outer_x = 100;
    
    void test()
    {
        Inner inner = new Inner();
        inner.display();
    }
    class Inner
    {
        void display()
        {
            System.out.println("Display : Outer_x = "+ outer_x);
        }
    }
}
class Non_Static_Inner_Nested_Class
{
    public static void main(String args[])
    {
        Outer outer = new Outer();
        outer.test();
    }
}