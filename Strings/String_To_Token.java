
// String To Token

import java . util .*;

public class String_To_Token 
{
    public static void main ( String [] args )
    {
        System . out . println ( "Enter the String : " );
        Scanner user = new Scanner ( System . in );
        String S = user . nextLine ();
        user.close();
        StringTokenizer stzr = new StringTokenizer ( S );
        String T;
        System . out . println ( "Tokens are : " );
        while ( stzr . hasMoreTokens () ) 
        {
            T = stzr . nextToken ();
            System . out . println ( T );
        }
    }
}