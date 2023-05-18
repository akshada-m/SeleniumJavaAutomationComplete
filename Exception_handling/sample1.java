package Exception_handling;

public class sample1 
{
	public static void main(String[] args) 
	{
		int num1=10;
		int num2=0;
		int div=0;
		
		try
		{
		div =num1/num2;
		}
		
		catch (ArithmeticException e) 
		{
			System.out.println("Arithmetic Exception handled ");
		}
		
		System.out.println(div);
	}
}
