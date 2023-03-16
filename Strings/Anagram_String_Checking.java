
/* Write a program to check if two given String is Anagram of each other. Your function should return true 
if two Strings are Anagram, false otherwise. A string is said to be an anagram if it contains the same characters 
and same length, but in a different order. e.g. army and mary are anagrams. */

import java.util.Arrays;

class Anagram_String_Checking
{
	static boolean AreAnagram(char[] str1, char[] str2)
	{
		int n1 = str1.length;
		int n2 = str2.length;
		if (n1 != n2)
        {
            return false;
        }
		Arrays.sort(str1);
		Arrays.sort(str2);
		for (int i = 0; i < n1; i++)
        {
			if (str1[i] != str2[i])
            {
				return false;
            }
        }
		return true;
	}

	public static void main(String args[])
	{
		char str1[] = { 't', 'e', 's', 't' };
		char str2[] = { 't', 't', 'e', 'w' };

		if (AreAnagram(str1, str2))
        {
			System.out.println("The two strings are anagram of each other");
        }
		else
        {
			System.out.println("The two strings are not anagram of each other");
        }
	}
}