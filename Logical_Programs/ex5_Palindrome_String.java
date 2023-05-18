package Logical_Programs;

import java.util.Scanner;

public class ex5_Palindrome_String 
{
	public static void main(String[] args) 
	{
//		Scanner scan =new Scanner(System.in);
//		System.out.println("Enter String : ");
//		String org=scan.next();
		String org="madam";
		String rev = "";
		for(int i=org.length()-1;i>=0;i--)
		{
			rev=rev+org.charAt(i);
		}
		if(org.equals(rev))
		{
		System.out.println("given String is Palindrome");
		}
		else
		{
			System.out.println("given string is not Palindrome");
		}
	}
}
