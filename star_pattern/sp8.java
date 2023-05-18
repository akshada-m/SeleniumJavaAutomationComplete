package star_pattern;

public class sp8 
{   
	//*********
	//*******
	//*****
	//***
	//*
	public static void main(String[] args) 
	{
		int starcount = 9;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=starcount;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			starcount=starcount-2;
		}
	
	}
}
