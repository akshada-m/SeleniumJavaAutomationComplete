package star_pattern;

public class pattern9 
{
	
//    *
//   **
//  *** 
// **** 
	public static void main(String[] args) 
	{
		int space=3;
		int star=1;
		for(int i=1;i<=4;i++)//rows
		{
			for(int j=1;j<=space;j++)//space
			{
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++)//star
			{
				System.out.print("*");
			}
			System.out.println();
			space--;
			star++;
		}
	}
		

}
