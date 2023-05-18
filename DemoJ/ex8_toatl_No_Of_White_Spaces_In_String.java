package DemoJ;

public class ex8_toatl_No_Of_White_Spaces_In_String
{
	public static void main(String[] args)
	{
	String str="a b c d e f d "; 
	int count=0;
	
	for(int i=0;i<=str.length()-1;i++)
	{
		char ch=str.charAt(i);
		
		if(ch==' ')
		{
			count++;
		}
		
	}
	System.out.println(count);
	}
}
