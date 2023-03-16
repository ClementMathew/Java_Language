
// Super to Access Member

class Access_Member
{
    int i;
}
class Access_Member_1 extends Access_Member
{
    int i;

    Access_Member_1(int a,int b)
    {
        super.i = a;
        i = b;
    }
    void show()
    {
        System.out.println("i in Superclass : "+super.i);
        System.out.println("i in Subclass : "+i);
    }
}
class Super_To_Access_Member
{
    public static void main(String args[])
    {
        Access_Member_1 subob = new Access_Member_1(1,2);
        subob.show();
    }
}