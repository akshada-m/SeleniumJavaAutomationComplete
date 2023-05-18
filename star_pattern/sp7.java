package star_pattern;

public class sp7 
{
//******
//*****
//****
//***
//**
//*
	public static void main(String[] args) 
	{
		int starcount = 6;
		for(int i=1;i<=6;i++)//rows
		{
			for(int j=1;j<=starcount;j++)//columns
			{
				System.out.print("*");
			}
			System.out.println();
			starcount--;
		}
	}
}
