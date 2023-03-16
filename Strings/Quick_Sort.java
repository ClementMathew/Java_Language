
// Implementing Quick Sort Algorithm for Sorting a List of Names in Ascending Order

import java.util.*;

class Quick_Sort
{
    String sortarr [];
    int length ;
    Scanner user = new Scanner ( System . in );

    void input ()
    {
        int i = 0 ;
        System . out . println ( "Enter the number of string : " );
        length = user . nextInt ();
        this . sortarr = new String [ length ];

        while ( length > i )
        {
            System . out . print ( ( i + 1 )+ " th String : " );
            sortarr [ i ] = user . next ();
            i ++;
        }
        sort ( 0 , length - 1 );
    }

    void sort ( int l , int h )
    {
        int higher = h ;
        int lower = l ;
        String pivot = sortarr [ lower +( higher - lower )/ 2 ];

        while ( lower <= higher )
        {
            while ( sortarr [ lower ]. compareToIgnoreCase ( pivot )< 0 )
            {
                lower ++;
            }
            while ( sortarr [ higher ]. compareToIgnoreCase ( pivot )> 0 )
            {
                higher --;
            }
            if ( lower <= higher )
            {
                swap ( higher , lower );
                lower ++;
                higher --;
            }
        }
        if ( l < higher )
        {
            sort ( l , higher );
        }
        if ( lower < h ) 
        {
            sort ( lower , h );
        }
    }

    void swap ( int higher , int lower )
    {
        String temp = sortarr [ lower ];
        sortarr [ lower ] = sortarr [ higher ];
        sortarr [ higher ] = temp ;
    }

    void display ()
    {
        System.out.println("\nThe sorted list : ");
        for ( String c : sortarr )
        {
            System . out . println ( c );
        }
        System.out.println();
    }
    public static void main ( String [] args ) 
    {
        try (Scanner user_1 = new Scanner ( System . in )) 
        {
            Quick_Sort srt = new Quick_Sort ();
            int op = 0 ;
            System . out . println ( "Menu \n 1-Input \n 2-Display \n 3-Exit" );

            while ( true )
            {  
                System.out.println("Enter choice : ");
                op = user_1 . nextInt ();

                switch ( op )
                {
                    case 1 : srt . input ();
                             break ;
                             
                    case 2 : srt . display ();
                             break ;

                    case 3 : System . exit ( 0 );

                    default : System . out . println ( "Error Select Correct Option" );
                }
            }
        }
    }
}