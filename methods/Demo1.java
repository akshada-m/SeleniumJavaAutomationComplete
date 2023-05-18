package methods;

public class Demo1 
{
public static void main(String[] args)
{
	System.out.println("main method started");
	d1();                                             //Static from same class
	Demo.d3();                                        //Static method from diff class
	Demo1 a=new Demo1();                          
	a.d2();                                           //non static from same class
	Demo b=new Demo();
	b.d4();                                           //non static from diff class
	
	System.out.println("main method ended");
}





//static regular method
public static void d1()
{
	System.out.println("running static regular method from same class d1");
}
//non static regular
public  void d2()
{
	System.out.println("running  non static regular method from same class d2");
}



}
