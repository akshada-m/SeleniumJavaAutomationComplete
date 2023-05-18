package Exception_handling;

public class sample2 
{
        public static void main(String[] args)
        {
			int []ar=new int[5];
			ar[2]=5;
		try
		{
			ar[6]=10;
			
		}
		
		catch (ArrayIndexOutOfBoundsException e) 
		{
			System.out.println("ArrayIndexOutOfBounds Exception handled");
			e.printStackTrace();
		}
		
	System.out.println("hi---");
	System.out.println(ar[3]);
	
		}
}
