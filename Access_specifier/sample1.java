package Access_specifier;

public class sample1
{
	
	
	
private void m1()
{
	System.out.println("private data member from  class");                //private cannot be access outside class directly
}

public void m2()
{
	sample1 s1=new sample1();
	s1.m1();                                                           //we can call in public and then access it outside class
	System.out.println("public data member from class");
	
}


}
