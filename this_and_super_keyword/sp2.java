package this_and_super_keyword;

public class sp2 extends sp
{
int b=20;
public void m2()
{
	int b=30;
	
	System.out.println(b);
	System.out.println(this.b);
	System.out.println(super.b);
}
}
