
// Implementing Linked List Using Collection

import java.util.*;

public class Linked_List_Using_Collections
{
    public static void main (String args [])
    {
        LinkedList < String > doubly = new LinkedList < > ();
        doubly.add ("Clement");
        doubly.add ("Brice");
        doubly.add ("Delwin");
        doubly.add ("Niyas");
        doubly.add ("Arun");
        System.out.println ("List after insertion : ");
        Iterator < String > itr1 = doubly.iterator ();
        while (itr1.hasNext())
        {
            System.out.println (itr1.next());
        }
        doubly.remove ("Clement");
        doubly.remove (2);
        System.out.println ("List after removing : " );
        Iterator < String > itr2 = doubly.iterator ();
        while (itr2.hasNext()) 
        {
            System.out.println (itr2.next());
        }
    }
}