package methods;
//static regular method called from different class
public class Static2 
{
public static void main(String[] args) 
{
	System.out.println("main method started");
	Diffclass.m3();                                  //classname.methodname();
	
	Diffclass.m4();
	
	System.out.println("main method ended");
}

}
