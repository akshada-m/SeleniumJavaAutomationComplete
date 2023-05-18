package DemoJ;

public class demo2_stringmethods
{
public static void main(String[] args) {
	String s1="Akshada";
	String s2="Akshada";
	String s3="akshada";
	String s4="AKSHADA";
	
	System.out.println(s1.length());
	System.out.println(s3.toUpperCase());
	System.out.println(s3);
	//s3=s3.toUpperCase();
	//System.out.println(s3);
	
	System.out.println(s4.toLowerCase());
	
	System.out.println(s1.equals(s2));//true
	System.out.println(s1.equalsIgnoreCase(s3));//true
	

	
}	
}
