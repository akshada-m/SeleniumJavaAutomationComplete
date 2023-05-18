package StringClass_method;

public class sample3 {
public static void main(String[] args) {
	
	String s1="velocity";
	String s2="VELOCITY";
	String s3="";
	
	
	//1.LENGTH
	
	System.out.println(s1.length());
	
	//2.touppercase temporary print
	
	System.out.println(s1.toUpperCase());
	
	System.out.println(s1);
	
    // touppercase permanant
	
	s1=s1.toUpperCase();
	
	System.out.println(s1);
	
	//3.tolowercase
	System.out.println(s2.toLowerCase());
	System.out.println(s2);
	
	s2=s2.toLowerCase();
	System.out.println(s2);
	
	//4.is empty
	System.out.println(s3.isEmpty());
	System.out.println(s1.isEmpty());
	
	
	
	
}
}
