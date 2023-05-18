package Logical_Programs;

public class ex10_prime_number //no divisible by itself only
{
	public static void main(String[] args)
	{
	int num= 1;	
	int count=0;
	for(int i=2;i<num;i++)
	{
		if(num%i==0)
		{
			count++;
			break;
		}
	}
	
	if(count==1)
	{
		System.out.println("no is not prime");
		
	}
	else
	{
		System.out.println("no is prime");
	}
	
	
	}
}
