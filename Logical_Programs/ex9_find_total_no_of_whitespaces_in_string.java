package Logical_Programs;

public class ex9_find_total_no_of_whitespaces_in_string
{
	public static void main(String[] args)
	{
		String s1="ab    c d";
		int count=0;
		
		for(int i=0;i<=s1.length()-1;i++)
		{
			char s2 = s1.charAt(i);
			if(s2==' ')//single quote for char
			{
				count++;
			}
		}
		System.out.println("no of whitespaces in given string= "+count);
		
		
		
	}
}