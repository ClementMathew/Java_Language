
// Returning Objects

class Sub_Return
{
    int a;

    Sub_Return(int i)
    {
        a = i;
    }

    Sub_Return Increase()
    {
        Sub_Return temp = new Sub_Return(a+10);
        return temp;
    }
}
class Returning_Objects
{
    public static void main(String args[]) 
    {
        Sub_Return ob1 = new Sub_Return(2);
        Sub_Return ob2;
        ob2 = ob1.Increase();
        System.out.println("First : "+ ob1.a);
        System.out.println("Second : "+ ob2.a);
        ob2 = ob2.Increase();
        System.out.println("Third : "+ ob2.a);
    }
}