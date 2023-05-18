package star_pattern;

public class sp6 
{
//	*
//	***
//	*****
//	*******
//	********
	public static void main(String[] args) 
	{
		int starcount = 1;
		for	(int i=1;i<=5;i++)//row
		{
			for(int j=1;j<=starcount;j++)//column
			{
			System.out.print("*");
			}
			System.out.println();
			starcount=starcount+2;
		}
	}
}
