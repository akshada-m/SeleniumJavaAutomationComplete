package this_and_super_keyword;

public class sample1 
{
int a= 10;               //global


public void m1()
{
	int a=20;            //local
	
	System.out.println(a);
	System.out.println(this.a);
}
}
