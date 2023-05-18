package Exception_handling;

public class sample3
{
   public static void main(String[] args) 
   {
	String []ar=new String[4];
	
	
	try 
	{
		System.out.println(ar[5]);
	}
	catch (Exception e) 
	{
		System.out.println("generic exception");
		e.printStackTrace();
	}
	System.out.println("hii");

   }
}
 