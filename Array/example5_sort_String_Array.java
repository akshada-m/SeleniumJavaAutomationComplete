package Array;

import java.util.Arrays;

public class example5_sort_String_Array
{
public static void main(String[] args) 
{
	String ar[]=new String[5];
	ar[0]="Akshada";
	ar[1]="Aishwarya";
	ar[2]="Varsha";
	ar[3]="Suvarna";
	ar[4]="Nita";
	
	System.out.println("Length of Array: "+ar.length);
	
	Arrays.sort(ar);
	
	
	System.out.println("----------printing in alphabetical ordeer---------");
	for(int i=0;i<=ar.length-1;i++)
	{
		System.out.println(ar[i]);
	}
	System.out.println("-------------printing in reverse alphabetical order");
	
	for(int i=ar.length-1;i>=0;i--) {
		System.out.println(ar[i]);
	}


	
	
}
}
