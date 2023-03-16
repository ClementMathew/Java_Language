
/* Write a java program to print the names of students by creating a student class, if no name is passed while creating an 
object of student class then the name should be unknown otherwise the name should be equal to the string value passed while
creating object of student class.*/

class Student
{
    int i,n;

    Student(String x)
    {
        System.out.println("The name of student is "+ x);
    }

    Student()
    {
        System.out.println("Unknown Name");
    }
    void Condition(String ch)
    {
        System.out.println(ch + " Worked Perfectly");
    }
}

class Display_Name_of_Student
{
    public static void main(String args[])
    {
        Student A = new Student("Clement");
        Student B = new Student();
        A.Condition("A");
        B.Condition("B");
    }
}