package methods;

public class method_With_returntype_3 
{
	public static void main(String[] args)
	   {
		  
		  String tagname = getTagname("//select[@id='month']");
		  System.out.println(tagname);
	   }
	   
	   public static String getTagname(String xpathexp)
	   {
		   int a=xpathexp.lastIndexOf('/');
		   int b=xpathexp.indexOf('[');
		  String tagname = xpathexp.substring(a+1, b);
		  return tagname;
	   }
	  
}
