
// Multi Thread Implementation

import java.util.Random;

class Multi_1 implements Runnable 
{
    static int n ;
    Random rand = new Random ();
    public void run ()
    {
        n = rand.nextInt (25);

        System.out.println (n);
    }
}
class Multi_2 implements Runnable
{
    public void run ()
    {
        if (Multi_1.n % 2 == 0)
        {
            System.out.println(( int ) Math.pow( Multi_1.n,2 ) + "\n");
        }
    }
}
class Multi_3 implements Runnable
{
    public void run ()
    {
        if (Multi_1.n % 2 != 0)
        {
            System.out.println(( int ) Math.pow( Multi_1.n,3 ) + "\n");
        }
        
    }
}
class Multi_Thread
{
    public static void main (String args []) 
    {
        for ( int i = 0 ; i < 10 ; i ++) 
        {
            Thread obj1 = new Thread ( new Multi_1 ());
            Thread obj2 = new Thread ( new Multi_2 ());
            Thread obj3 = new Thread ( new Multi_3 ());
            try 
            {
                Thread . sleep (1000);
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
            obj1.start ();
            obj2.start ();
            obj3.start ();
        }
    }
}