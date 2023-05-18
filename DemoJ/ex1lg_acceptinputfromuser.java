package DemoJ;

import java.util.Scanner;

public class ex1lg_acceptinputfromuser
{
	public static void main(String[] args) 
	{
		Scanner scan =new Scanner(System.in);
		for (int i=1;i<=5;i++)
		{
			System.out.println("enter no: ");
			int num = scan.nextInt();
			if(num%2==0)
			{
				System.out.println("no is even");
				
			}
			else
			{
				System.out.println("no is odd");
			}
			System.out.println("----------------");
		}
		
	
		
		
	}
}
