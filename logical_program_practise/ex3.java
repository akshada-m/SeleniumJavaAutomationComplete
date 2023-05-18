package logical_program_practise;

public class ex3 
{
	public static void main(String[] args)
{
	int n=3;
	int count=0;
	for(int i=2;i<n;i++)
	{
		if(n%i==0)
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
