package Array;

public class example1_String_array  //String array
{
public static void main(String[] args)
{
	String [] ar=new String[5];
	ar[0]="Akshada";
	ar[1]="Aishwarya";
	ar[2]="Varsha";
	ar[3]="shital";
	ar[4]="Shrutika";
	
	
	System.out.println(ar.length);
	
	System.out.println(ar[4]);
	
	System.out.println("---------------printing all info in array----------------");
	for (int i=0;i<=ar.length-1;i++)
	{
		System.out.println(ar[i]);
	}
}
}
