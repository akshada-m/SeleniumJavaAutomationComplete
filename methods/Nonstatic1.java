package methods;
//3.non static method call from same class
public class Nonstatic1 
{
public static void main(String[] args) 
{
	System.out.println("main method started");
	  Nonstatic1 a=new Nonstatic1();                                                            // classname objectname=new classname   -   object creation
	  a.m5();                                                                              //   objectname.methodname();                                            calling non static regular method from same class
	
	
	
	System.out.println("main method ended");
}


//non static regular method
 public void m5()
 {
	 System.out.println("running non static method from same class m5");
 }






}
