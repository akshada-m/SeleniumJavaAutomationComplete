package Types_of_variables;
//non static variable call from  same and diff class
public class nsv1 
{
int a=20;
int b=40;


public static void main(String[] args) 
{
	nsv1 v1=new nsv1();           
	System.out.println(v1.a);        //--->to call from same class -->objectname.variablename
	System.out.println(v1.b);
	v1.addition();
	
	nsv2 v2=new nsv2();
	System.out.println(v2.a);              
	System.out.println(v2.b);
	
	
	
}


public void addition()
{
	System.out.println(a+b);
}
}
	
	
	
