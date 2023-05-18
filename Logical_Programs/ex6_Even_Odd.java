package Logical_Programs;

import java.util.Scanner;

public class ex6_Even_Odd
{
	public static void main(String[] args) 
	{
	Scanner s=new Scanner(System.in);
	System.out.println("enter no: ");
	int num = s.nextInt();
	if(num % 2==0)
	{
		System.out.println("given no is even");
	}
	else
	{
		System.out.println("given no is odd: ");
	}
	
	}
}
