package Array;

public class example7_StringArray_declaration_initialization_singleStep
{
public static void main(String[] args) 
{
	String[] ar= {"akshada","harshada","shital","varsha","sadhna"};
	
	System.out.println("length of string array: "+ar.length);
	System.out.println("print single info from array : "+ar[2]);
	System.out.println("-------------print all info from string array------------------");
	for (int i=0;i<=ar.length-1;i++)
	{
		System.out.println(ar[i]);
	}
}
}
