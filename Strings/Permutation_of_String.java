
/* Write a Java program to print all permutations of a given String. For example, if given String is GOD
then your program should print all 6 permutations of this string. e.g. GOD, OGD, DOG, GDO, ODG and DGO */

public class Permutation_of_String
{
	public static void main(String[] args)
	{
		String str = "apj";
		int n = str.length();
		Permutation_of_String per = new Permutation_of_String();
		per.Permute(str, 0, n-1);
	}

	private void Permute(String str,int l, int r)
	{
		if (l == r)
        {
			System.out.println(str);
        }
		else
		{
			for (int i = l; i <= r; i++)
			{
				str = Swap(str,l,i);
				Permute(str, l+1, r);
				str = Swap(str,l,i);
			}
		}
	}

	public String Swap(String a,int i, int j)
	{
		char temp;
		char[] charArray = a.toCharArray();
		temp = charArray[i] ;
		charArray[i] = charArray[j];
		charArray[j] = temp;
		return String.valueOf(charArray);
	}
}