package DemoJ;

import java.util.Scanner;

public class ex6lg_even_Odd_no
{
public static void main(String[] args) 
{
	for(int i=1;i<=10;i++)
		
	{
		Scanner scan=new Scanner(System.in);
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
		System.out.println("-------------");
	}
	
}
}
