package Logical_Programs;

public class ex12_reverseno_by_using_String_fun
{
public static void main(String[] args) 
{
	int num=123;
	String rev="";
     int revno =0;
	
	String str = Integer.toString(num);
	for (int i=str.length()-1;i>=0;i-- ) 
	{
		rev=rev+str.charAt(i);
	   revno = Integer.parseInt(rev);
	}
	System.out.println(revno);
	
		
	
}
	
	}

