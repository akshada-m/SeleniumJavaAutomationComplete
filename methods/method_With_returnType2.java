package methods;

public class method_With_returnType2
{
	public static void main(String[] args)
	{
	String s1="Akshada";
	int size1 = findLengthOfString(s1);
	System.out.println(size1);
	
	String str1 = convertStringToUppCase(s1);
	System.out.println(str1);
	
	}
	
	public static int findLengthOfString(String str)
	{
		int size = str.length();
		return size;
	}
	
	public static String convertStringToUppCase(String str)
	{
		String s2= str.toUpperCase();
		return s2;
	}
}