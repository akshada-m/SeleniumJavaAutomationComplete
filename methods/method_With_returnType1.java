package methods;

public class method_With_returnType1
{
	public static void main(String[] args) 
	{
	    int sum = addition(10, 20);
	    System.out.println(sum);
	    
	    int num=100;
	    int mul = multiplication(sum, num);
	    System.out.println(mul);
	
	}
	
	//method with int return type
		public static int addition(int a,int b)
		{
			int c=a+b;
			return c;
		}
		
		//method with int return type
		public static int multiplication(int a,int b)
		{
			int num3= a*b;
		    return num3;
		}
}
