
/* The input is a string of words, and the output should be the words in reverse but with the letters in the 
original order. For example, the string Dog bites man should output as man bites Dog. After you’ve solved 
this challenge, try adding sentence capitalization and punctuation to your code.*/

class Reverse_Words_in_String
{
    static void Reverse(char str[],int start,int end)
    {
        char temp;
        while (start <= end)
        {
	        temp = str[start];
	        str[start] = str[end];
	        str[end] = temp;
	        start++;
	        end--;
        }
    }
    static char[] ReverseWords(char []S)
    {
		int start = 0;
		for (int end = 0; end < S.length; end++)
		{
			if (S[end] == ' ')
			{
			Reverse(S, start, end);
			start = end + 1;
			}
		}
		Reverse(S, start, S.length - 1);
		Reverse(S, 0, S.length - 1);
		return S;
	}
	public static void main(String[] args)
	{
		String S = " I am Good ";
		char []R = ReverseWords(S.toCharArray());
		System.out.print(R);
	}
}