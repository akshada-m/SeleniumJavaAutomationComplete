package Types_of_variables;

public class sample2 
{
	
		int c=30;                               //global variable -----> can be called in any method
		
		public void m1(int a)
		{
			int b=20;                                       
			System.out.println(b);                               //local variable
			System.out.println(c);                              //global variable
			System.out.println(a);                               //local 
		}
		
		public void m2() 
		{
			int b=20;
			//System.out.println(a);                      
			System.out.println(c);                   //global variable
			System.out.println(b);                     //local variable
		}
		
		
	}

