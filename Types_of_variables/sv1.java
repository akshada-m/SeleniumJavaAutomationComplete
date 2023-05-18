package Types_of_variables;
//static variable call from same and different class 
public class sv1 
{
	static int a=20;                        //static gloabal variable
	static int b=30;
	
	
public static void main(String[] args) 
{
	System.out.println(a+b);                 //to call static variable from same class--->variablename
	sv1 v1=new sv1();
	v1.s1();
	System.out.println(sv2.a);               //to call static variable from differant class--->classname.variablename
	System.out.println(sv2.b);
}
	
	public void s1()
	{
	System.out.println(a+b);                   //we can call static variable in both static and non static methods 
	}
	
}
