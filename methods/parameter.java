package methods;

public class parameter 
{
	public static void main(String[] args)
	{
		System.out.println("main method started");
		//static with parameters for same class
		addition(10,10);                     
		addition(10,10,10);  
		//static with parameters for diff class
		dcpara.addition(1,1);                     
		dcpara.addition(1,1,1);  
		                                      
		
		 //non static with parameter for same class              
		                                          
		parameter s1= new parameter();
		s1.p1( 20,10,10);                                     
		parameter s2= new parameter();
		s2.p1( 20,10);
		 //non static with parameter for same class  
		dcpara s4= new dcpara();  
		s4.p1( 2,3); 
		dcpara s3= new dcpara();
		s3.p1( 2,1,1);   
		
		
	    System.out.println("main method ended");
	}
	
	//static with parameters
	public static void addition(int a,int b)
	{
		int c=a+b;
			System.out.println(c);
	}
	
	public static void addition(int a,int b,int d)
	{
		int c=a+b+d;
			System.out.println(c);
	}
	
	//non static with parameters
	
	public void p1(int a,int b)
	{
		int c=a+b;
			System.out.println(c);
	}
	
	
	public void p1 (int a,int b,int d)
	{
		int c=a+b+d;
			System.out.println(c);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
}

