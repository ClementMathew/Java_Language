
/* Create an abstract class named Shape that contains an empty method named NumberOfSides().Provide three classes named
Rectangle ,Triangle and Hexagon such that each one of the classes extends the class Shape .Each one of the classes contains
only the method NumberOfSides() that shows the number of sides in the given geometrical structures.*/

abstract class Shape
{
    abstract void NumberOfSides();
}
class Rectangle extends Shape
{
    void NumberOfSides()
    {
        System.out.println("Number of sides of rectangle is 4");
    }
}
class Triangle extends Shape
{
    void NumberOfSides()
    {
        System.out.println("Number of sides of triangle is 3");
    }
}
class Hexagon extends Shape
{
    void NumberOfSides()
    {
        System.out.println("Number of sides of hexagon is 6");
    }
}
class Geometry_Sides
{
    public static void main(String args[])
    {
        Shape S;
        S = new Rectangle();
        S.NumberOfSides();
        S = new Triangle();
        S.NumberOfSides();
        S = new Hexagon();
        S.NumberOfSides();
    }
}
