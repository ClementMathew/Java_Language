
/* Write a Java Program to Create a Room class, the Attributes of this class are room_no, room_length, room_breadth, room_area.
The class member functions are Setdata, Displaydata. In Setdata you have to read all the attribute values from user and in 
Display data find the area of room and also display all the details including area.*/

import java.util.Scanner;

class Room
{
    int room_no,room_length,room_breadth,room_area;

    void Setdata()
    {
        Scanner user = new Scanner (System.in);
        System.out.println("Enter the room number : ");
        room_no = user.nextInt();
        System.out.println("Enter the room length : ");
        room_length = user.nextInt();
        System.out.println("Enter the room breadth : ");
        room_breadth = user.nextInt();
        user.close();
    }

    void Displaydata()
    {
        System.out.println("The room number is "+room_no);
        System.out.println("The room length is "+room_length);
        System.out.println("The room breadth is "+room_breadth);
        room_area = room_length*room_breadth;
        System.out.println("The room area is "+room_area);
    }
}

class Room_Data_Area
{
    public static void main (String args[])
    {
        Room A1 = new Room();
        A1.Setdata();
        A1.Displaydata();
    }
}