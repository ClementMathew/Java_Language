
// String Methods and Buffer Class

import java.util.Scanner;

class Test_String_Methods
{
    public static void main (String args[])
    {
        System.out.println("Press 1 to lowercase");
        System.out.println("Press 2 to uppercase");
        System.out.println("Press 3 to replace x with y");
        System.out.println("Press 4 to trim");
        System.out.println("Press 5 to check equal");
        System.out.println("Press 6 to take length");
        System.out.println("Press 7 to take nth character from string");
        System.out.println("Press 8 to compare");
        System.out.println("Press 9 to concatinate");
        System.out.println("Press 10 to display substring from n");
        System.out.println("Press 11 to display substring from n to m");
        System.out.println("Press 12 to display Index");
        System.out.println("Press 13 to search the character after nth index");
        System.out.println("-------------Buffer-------------");
        System.out.println("Press 14 to insert x at nth position");
        System.out.println("Press 15 to append another string");
        System.out.println("Press 16 to insert string in nth position");
        System.out.println("Press 17 to change length to n");
        System.out.println("Enter your choice : ");
        
        try (Scanner user = new Scanner (System.in)) 
        {
                int n = user.nextInt();
                String S1,S2,S;

                switch(n)
                {
                    case 1: System.out.println("The string to convert to lowercase is : ");
                            S1 = "ClEmEnT";
                            System.out.println(S1);
                            System.out.println("The converted string is : ");
                            System.out.println(S1.toLowerCase());
                            break;

                    case 2: System.out.println("The string to convert to uppercase is : ");
                            S1 = "Clement";
                            System.out.println(S1);
                            System.out.println("The converted string is : ");
                            System.out.println(S1.toUpperCase());
                            break;

                    case 3: System.out.println("The string to be replaced is : ");
                            S1 = "Clement";
                            System.out.println(S1);
                            System.out.println("The replaced string is : \n"+ S1.replace('t','s'));
                            break;

                    case 4: System.out.println("The string to trim is : ");
                            S1 = "   Clement Mathew   ";
                            System.out.println(S1);
                            System.out.println("The trimmed string is : \n"+ S1.trim());
                            break;

                    case 5: System.out.println("The main string is : ");
                            S = "Clement";
                            System.out.println(S);
                            System.out.println("The first string to compare is : ");
                            S1 = "Clement";
                            System.out.println(S1);
                            System.out.println("The second string to compare is : ");
                            S2 = "ClemenT";
                            System.out.println(S2);
                            System.out.println("The first comparison is ");
                            System.out.println("The comparison is "+ S.equals(S1));
                            System.out.println("The second comparison is ");
                            System.out.println("The comparison is "+ S.equals(S2));
                            break;

                    case 6: System.out.println("The string to take length is : ");
                            S1 = "Clement";
                            System.out.println(S1);
                            System.out.println("The length of the string is "+ S1.length());
                            break;

                    case 7: System.out.println("The string to take nth character is : ");
                            S1 = "Clement";
                            System.out.println(S1);
                            int num = 3;
                            System.out.println("The value of n is : "+(num+1));
                            System.out.println("The character in string is "+ S1.charAt(num));
                            break;

                    case 8: System.out.println("The first string to compare : ");
                            S1 = "Clement";
                            System.out.println(S1);
                            System.out.println("The second string to compare : ");
                            S2 = "ClemenT";
                            System.out.println(S2);
                            System.out.println("The compared value is "+ S1.compareTo(S2));
                            break;
                        
                    case 9: System.out.println("The first string is : ");
                            S1 = "Clement ";
                            System.out.println(S1);
                            System.out.println("The second string to concatinate is : ");
                            S2 = "Mathew";
                            System.out.println(S2);
                            System.out.println("The concatinated string is "+ S1.concat(S2));
                            break;
                
                    case 10: System.out.println("The string to print substring is : ");
                             S1 = "Clement Mathew";
                             System.out.println(S1);
                             System.out.println("The substring is : "+ S1.substring(8));
                             break;

                    case 11: System.out.println("The string to print substring is : ");
                             S1 = "Clement Mathew";
                             System.out.println(S1);
                             System.out.println("The substring is : "+ S1.substring(8,12));
                             break;

                    case 12: System.out.println("The string to find the index of a character is : ");
                             S1 = "Clement";
                             System.out.println(S1);
                             System.out.println("The index of the character is : "+ S1.indexOf('m'));
                             break;

                    case 13: System.out.println("The string to find the index of a character after nth index is : ");
                             S1 = "Clement";
                             System.out.println(S1);
                             System.out.println("The index of the character is : "+ S1.indexOf('e',3));
                             break;

                    case 14: StringBuffer S3 = new StringBuffer("Clement");
                             S3.setCharAt(3,'n');
                             System.out.println("The final string after string buffer operation is : " + S3);
                             break;

                    case 15: StringBuffer S4 = new StringBuffer("Clement ");
                             System.out.println("The appended string is : "+ S4.append("Mathew"));
                             break;

                    case 16: StringBuffer S5 = new StringBuffer("Clement");
                             System.out.println("The final string after string buffer operation is : "+ S5.insert(5,"Mathew"));
                             break;

                    case 17: StringBuffer S6 = new StringBuffer("ClementMathew");
                             S6.setLength(7);
                             System.out.println("The final string after string buffer operation is : " + S6);
                             break;

                    default: System.out.println("You entered wrong choice");
                             break;
                }
        }
    }
}