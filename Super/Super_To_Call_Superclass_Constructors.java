
// Using Super to Call Superclass Constructors

class Super
{
    Super()
    {
        System.out.println("Superclass");
    }
}
class Sub extends Super
{
    Sub()
    {
        super();
        System.out.println("Subclass");
    }
}
class Super_To_Call_Superclass_Constructors
{
    public static void main(String args[])
    {
        Sub subob = new Sub();
    }
}