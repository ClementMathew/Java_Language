
// Static Method in interface

public class Interface_Static_Method implements MyInterface
{
    public void existingMethod(String str)
    {
        System.out.println("String is : "+str);
    }
    public static void main(String args[])
    {
        Interface_Static_Method obj = new Interface_Static_Method();
        obj.newMethod();
        MyInterface.anotherNewMethod();
        obj.existingMethod("Java is easy to learn");
    }
}
interface MyInterface
{
    default void newMethod()
    {
        System.out.println("Newly added default method");
    }
    static void anotherNewMethod()
    {
        System.out.println("Newly added static method");
    }
    void existingMethod(String str);
}