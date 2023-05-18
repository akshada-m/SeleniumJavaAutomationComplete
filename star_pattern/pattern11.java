package star_pattern;

public class pattern11 
{
//	*****
//	 ****
//	  ***
//	   **
//	    *
	
	public static void main(String[] args)
	{
		int space=0;
		int star=5;
		for(int i=1;i<=5;i++)//rows
		{
			for(int j=1;j<=space;j++)//space
			{
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++)//stars
			{
				System.out.print("*");
			}
			System.out.println();
			space++;
			star--;
			
			
		}
	}
}
