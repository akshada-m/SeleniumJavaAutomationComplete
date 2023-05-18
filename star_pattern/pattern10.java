package star_pattern;

public class pattern10 
{
//        *
//      ***
//	  *****
//  *******	
//*********
	public static void main(String[] args) 
	{
		int space = 8;
		int star = 1;
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=space;j++)
		{
			System.out.print(" ");
		}
		
		for(int j=1;j<=star;j++)
		{
			System.out.print("*");
		}
		System.out.println();
		space=space-2;
		star=star+2;
		
	}
	}
	
}
