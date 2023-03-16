
/* Create a class to print an integer and a character with two methods having the same name but different sequence of the integer
   and the character parameters. */

class Print_int_char
{
   void Print(int a,char b)
   {
      System.out.println("The integer and character are "+a+" "+b);
   }

   void Print(char b,int a)
   {
      System.out.println("The character and integer are "+b+" "+a);
   }
}

class Print_integer_and_character_in_all_order
{
   public static void main(String[] args)
   {
      Print_int_char A1 = new Print_int_char();
      A1.Print(5,'d');
      A1.Print('d',5);
   }
}