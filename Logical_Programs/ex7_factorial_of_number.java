package Logical_Programs;

public class ex7_factorial_of_number
{
	public static void main(String[] args)
	{
		int num=5;
		int fact=1;
		for(int i=num;i>=1;i--) 
		{
			fact=fact*i;//5*4*3*2*1
		}
		System.out.println(fact);
		
	}
}
