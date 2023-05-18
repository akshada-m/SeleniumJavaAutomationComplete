package Array;

public class example3_int_array_in_reverse_order
{
public static void main(String[] args) 
{
	int ar[]=new int[4];
	
	ar[0]=400;
	ar[1]=200;
	ar[2]=100;
	ar[3]=300;
	
	System.out.println(ar.length);
	System.out.println("--------------------");
	for(int i=ar.length-1;i>=0;i--)
	{
		System.out.println(ar[i]);
	}
	
}
}
