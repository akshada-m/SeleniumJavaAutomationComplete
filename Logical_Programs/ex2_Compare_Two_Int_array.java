package Logical_Programs;

import java.util.Arrays;

public class ex2_Compare_Two_Int_array 
{
	public static void main(String[] args) 
	{
	int ar1[]	= {1,2,3};
	int ar2[]	= {3,2,1};
	int ar3[]	= {1,2,3};
	System.out.println(Arrays.equals(ar1,ar2));//false
	System.out.println(Arrays.equals(ar1,ar3));//true
	System.out.println(Arrays.equals(ar2,ar3));//false
	}
}
