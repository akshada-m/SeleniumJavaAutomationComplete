package Logical_Programs;

import java.util.Iterator;

public class ex13_reverse_middle_string
{
public static void main(String[] args)
{
	String str="my name is akshada";
	String[] strall = str.split(" ");
	for (int i = 0; i <= strall.length-1; i++)
	{
		if (i%2==0) 
		{
			strall[i]=m1(strall[i]);
		}
		
	}
	for (int i = 0; i <=strall.length-1; i++) 
	{
		System.out.print(strall[i]+" ");
	}
	
	
	
		
	
	 
	
	
	
	
	
}


	public  static String  m1(String s1)
	{
		String rev="";
		for (int i = s1.length()-1; i>=0; i--) 
		{
			rev = rev+ s1.charAt(i);
			
		}
		return rev;
	}
	
}
