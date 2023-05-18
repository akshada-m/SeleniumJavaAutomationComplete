package StringClass_method;

public class sample4
{
public static void main(String[] args) {
	String s1="abc";
	String s2="ABC";
	String s3="akshada";
	String s4="aksh";
	String s5="ada";
	String s6="akshada";
	String s7="velocity";
	
	
	
	//5.euauals
	
	System.out.println(s1.equals(s2));//false
	
	//6.equals ignore case
	System.out.println(s1.equalsIgnoreCase(s2));//true
	
	//7.contains
	System.out.println(s3.contains(s4));//true
	System.out.println(s3.contains(s2));//false
	
	//8.char at index
	System.out.println(s3.charAt(3));//h
	
	//9.inex of char
	System.out.println(s3.indexOf('h'));//3
	System.out.println(s3.indexOf('a'));//0
	
	//10.last index of 
	System.out.println(s3.lastIndexOf('a'));//6
	System.out.println(s3.lastIndexOf('h'));//3
	
	//11.stsrts with
	System.out.println(s3.startsWith(s4));//true
	System.out.println(s3.startsWith(s1));//false
	
	//12.ends with
	System.out.println(s3.endsWith(s5));//true
	System.out.println(s3.endsWith(s6));//true
	
	//13.concat
	System.out.println(s4.concat(s5));
	
	//14.replace
	System.out.println(s3.replace("da","ta"));//akshata
	System.out.println(s3.replace("da", "y"));//akshay
	
	//15.substring
	System.out.println(s7.substring(4));//city
	System.out.println(s7.substring(2));//locity
	
	//16.substring begin and end
	System.out.println(s7.substring(0, 4));//velo
	System.out.println(s3.substring(2, 5));//sha
	
	
	
	
	
}
}
