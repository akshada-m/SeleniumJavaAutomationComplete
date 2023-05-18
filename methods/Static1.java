package methods;

//1.static regular method called from same class
public class Static1         
{
public static void main(String[] args)
{
	System.out.println("main method started");
	m1();                                                    //method name();   -
	m2();
	
	System.out.println("main method ended");
}


//static regular method
public static void m1()
{
	System.out.println("running static regular method from same class m1");
}

public static void m2()
{
	System.out.println("running static regular method from same class m2");
}







}
