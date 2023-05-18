package methods;
//4.non static method called from diiferent class
public class Nonstatic2 
{
public static void main(String[] args) 
{
	System.out.println("main method started");
	Dc b=new Dc();                                            // classname objectname=new classname   -   object creation
	b.m6();                                                    // objectname.methodname();  
	b.m7();
	
	System.out.println("main method ended");
}

}