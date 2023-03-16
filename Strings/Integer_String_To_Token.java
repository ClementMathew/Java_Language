
// String Tokenizer Implementation

import java . util .*;

public class Integer_String_To_Token 
{
    public static void main ( String [] args )
    {
        System . out . println ( "Enter the line of integer : " );
        Scanner user = new Scanner ( System . in );
        String S = user . nextLine ();
        user.close();
        StringTokenizer stzr = new StringTokenizer ( S );
        int num , Sum = 0 ;
        System . out . println ( "Digits are : " );
        while ( stzr . hasMoreTokens () ) 
        {
            num = Integer . parseInt ( stzr . nextToken ());
            System . out . println ( num );
            Sum += num ;
        }
        System . out . println ( "Sum is :" + Sum );
    }
}