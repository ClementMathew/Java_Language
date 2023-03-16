
// This Keyword 

class Demo
{
    double width;
    double length;
    double height;

    Demo(double w,double l,double h)
    {
        this.width = w;
        this.length = l;
        this.height = h;

        System.out.println("Width : "+ this.width);
        System.out.println("Length : "+ this.length);
        System.out.println("Height : "+ this.height);
    }
}

class This_Demo
{
    public static void main (String args[])
    {
        System.out.println("First Object : ");
        Demo d1 = new Demo(10,20,15);
        System.out.println("Second Object : ");
        Demo d2 = new Demo(3,6,2);
    }
}