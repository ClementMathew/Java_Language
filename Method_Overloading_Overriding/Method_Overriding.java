
// Method Overriding

class Animal
{
    public void move()
    {
        System.out.println("Animals can move");
    }
}
class Dog extends Animal
{
    public void move()
    {
        System.out.println("Dogs can run");
    }
}
public class Method_Overriding
{
    public static void main(String args[])
    {
        Dog d = new Dog();
        d.move();
    }
}