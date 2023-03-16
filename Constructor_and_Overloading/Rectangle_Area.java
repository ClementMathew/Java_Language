
// Area of Rectangle Using Default and Parametrised Constructor

class Area
{
    int Length,Width;

    Area(int x,int y)
    {
        Length=x;
        Width=y;
    }
    void Area_1()
    {
        int A = Length * Width;
        System.out.println("The area is "+ A);
    }
    void Measurements()
    {
        System.out.println("The length is "+ Length +"\nThe width is "+ Width);
    }
}

class Rectangle_Area
{
    public static void main (String args[])
    {
        Area A1 = new Area(5,6);
        A1.Measurements();
        A1.Area_1();
    }
}