package Array;

import java.util.Arrays;

public class example4_sort_int_array
{
public static void main(String[] args) {
	 
	int ar[]=new int[5];
	ar[0]=200;
	ar[1]=500;
	ar[2]=300;
	ar[3]=100;
	ar[4]=400;
	
	System.out.println("length of Array: "+ar.length);
	
	Arrays.sort(ar);
	
	System.out.println("-------ascending order---------");
	for(int i=0;i<=ar.length-1;i++)
	{
		System.out.println(ar[i]);
		
	}
	
	
	System.out.println("------------descending order--------------");
	
	for (int i=ar.length-1;i>=0;i--)
	{
		System.out.println(ar[i]);
	}

	

}
}
