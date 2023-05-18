package polymorphism;

public class method_overloading        //example of compiletime polymorphism
{
public void addition(int a,int b)
{
	int sum=a+b;
	System.out.println(sum);
}

public void addition(int a,int b,int c)
{
	int sum=a+b+c;
	System.out.println(sum);
}
}
