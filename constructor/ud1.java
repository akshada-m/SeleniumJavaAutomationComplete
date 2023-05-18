package constructor;

public class ud1 
{
int a;
int b;
    
ud1()
{
	a=10;
	b=20;
	
}

public static void main(String[] args) 
{
	 
	ud1 d1=new ud1();
	d1.sum();
	 
	d1.mul();
	System.out.println("---------------------");
	   
	
	ud2 d2=new ud2();
	d2.div();
	
	
}


public void sum()
{
	int sum=a+b;
	System.out.println(sum);
}


public void mul()
{
	int mul=a*b;
	System.out.println(mul);
}



}
