package DemoJ;

public class ex9_armstrong_no
{
	public static void main(String[] args) {
		int num = 153;
		int sum=0;
		
		for(int i=num;i>0;i=i/10)
		{
			int rem = i%10;
			sum=sum+(rem*rem*rem);
			
		}
		System.out.println(sum);
		
			if(sum==num)
			{
				System.out.println("given no is armstrong ");
			}
			else 
			{
				System.out.println("given no is not armstrong");
			}
	}
}
