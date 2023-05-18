package control_statements;

public class nested_if 
{
public static void main(String[] args)
{
	
	String UN="ABC";
	int PWD = 123;
	
	if(UN=="ABC")
	{
		System.out.println("Correct username");
		System.out.println("enter your password");
		if(PWD==123)
		{
			System.out.println("Correct password-->login successful");
		}
		else
		{
			System.out.println("Incorrect password--->login failed");
		}
	}
		
	else
		{
			System.out.println("Wrong username-->try again with valid credentials");
		}
	}
	
}
	
	
	
	


