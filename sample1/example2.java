package sample1;

public class example2
{
public static void main(String[] args) {
	String s1="Akshada";
	String s2="Aksh";
	String s3="ada";
	String s4="velocity";
	
	System.out.println(s1.contains(s2));//true
	
	System.out.println(s1.charAt(0));//A
	
	System.out.println(s1.indexOf('A'));//0
	
	System.out.println(s1.lastIndexOf('a'));//6
	
	System.out.println(s1.startsWith("s2"));//true
	
	System.out.println(s1.endsWith(s3));//true
	
	System.out.println(s2.concat(s3));//Akshada
	
	System.out.println(s1.replace("da","y"));//Akshay
	
	System.out.println(s4.substring(4));//city
	
	System.out.println(s4.substring(0, 4));//velo
	
	
	
	
	
}
}
