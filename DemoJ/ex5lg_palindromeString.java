package DemoJ;

public class ex5lg_palindromeString 
{
public static void main(String[] args) 
{
	String str="madam";
	String rev="";
	for (int i =str.length()-1; i >=0; i--) 
	{
		rev=rev+str.charAt(i);
	}
	System.out.println("org :"+str);
	System.out.println("rev :"+rev);
	
	if (str.equals(rev)) 
	{
		System.out.println("palindrome String");
	}
	else
	{
		System.out.println("not palindrome String");
	}
	
	
}
}
