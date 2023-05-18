package logical_program_practise;

public class ex1 
{
	public static void main(String[] args)
	{
	int n=123;

	for(int i=n;i>0;i=i/10)
	{
	int rem=i%10;
	System.out.print(rem);
	}

	}
}
