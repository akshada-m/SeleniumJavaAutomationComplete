package logical_program_practise;

public class ex2 
{
	public static void main(String[] args)
	{
	int n=123;
	String rev="";
	String s=Integer.toString(n);
	for(int i=s.length()-1;i>=0;i--)
	{
	rev=rev+s.charAt(i);
	}
	int n1=Integer.parseInt(rev);
	System.out.print(n1);

	}
}
