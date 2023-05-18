package DemoJ;

public class ex3lg_multiplyWithoutUsingMultiplyOperator
{
	public static void main(String[] args)
	{
		int a=12;
		int b=4;
		int sum=0;
		
		for(int i=1;i<=b;i++) 
		{
			sum=sum+a;
		}
		System.out.println("multiplication of two no= "+sum);
	}
}
