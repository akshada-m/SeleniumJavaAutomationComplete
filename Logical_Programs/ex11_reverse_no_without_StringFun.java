package Logical_Programs;

public class ex11_reverse_no_without_StringFun
{
public static void main(String []args)
{
	int num=12345;
	int rem;
	
	for(int i=num;i>0;i=i/10)
	{
	   rem=i%10;
	   System.out.print(rem);
	   
	}
	
}
}
