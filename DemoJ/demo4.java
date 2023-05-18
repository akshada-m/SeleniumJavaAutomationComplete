package DemoJ;

import java.util.Arrays;

public class demo4 
{
	public static void main(String[] args) 
	{
	int ar[]=new int [5];
	ar[0]=50;
	ar[1]=20;
	ar[2]=40;
	ar[3]=30;
	ar[4]=10;
	
	System.out.println(ar[0]);
	System.out.println(ar.length);
	
	for(int i=0;i<=ar.length-1;i++)
	{
		System.out.println(ar[i]);
	}
	System.out.println("----------------");
	Arrays.sort(ar);
	for(int i=0;i<=ar.length-1;i++)
	{
	System.out.println(ar[i]);	
	}
	
	}
}
