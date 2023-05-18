package StringClass_method;

public class sample2
{
public static void main(String[] args) {
	
	//without using new keyword:constant pool area--->doesnt allow duplicate object creation
	String s1="ABC";
	String s2="ABC";
	String s3="abc";
	String s4="abcd";
	String s5="ABCD";
	
	//by using new keyword
	String s6=new String("Akshada");
	String s7=new String("Akshada");
	String s8=new String("ABCD");
	
	
	System.out.println(s5==s8);
	
	//compares address  and returns true if same else false.
	System.out.println(s1==s2);
	
	System.out.println(s1==s3);
	
	System.out.println(s4==s5);
	
	System.out.println(s6==s7);
	
}
}
