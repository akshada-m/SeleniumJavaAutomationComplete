package DemoJ;

import java.util.Arrays;

public class ex2lg_comparetwointarray 
{
	public static void main(String[] args) {
		int ar1[]= {1,2,3,4,5};
		int ar2[]= {4,5,6,7,8};
		int ar3[]= {1,2,3,4,5};
		System.out.println(Arrays.equals(ar1, ar2)+" :ar1 and ar2");//false
		System.out.println(Arrays.equals(ar2, ar3)+" :ar2 and ar3");//false
		System.out.println(Arrays.equals(ar1, ar3)+" :ar1 and ar3");//true
		
		
	}
}
