package constructor;

public class ud6 
{
	int num1;
	int num2;
	String sname;
	
	
	ud6()
	{
		num1=20;
		num2=30;
		
	}
	
	ud6(int a,int b)
	{
		num1=a;
		num2=b;
		
	}
	
	ud6(String name)
	{
	sname=name;	
	}
	
	public void addition ()
	{
		int sum=num1+num2;
		System.out.println(sum);
	}
	
	public void sname()
	{
		System.out.println(sname);
	}
}
