package logical_program_practise;

public class ex6 
{
	public static void main(String []args)
	{
	String s1="abeh";
	
	for(int i=0;i<=s1.length()-1;i++)
	{
		
	if(s1.charAt(i)=='a'||s1.charAt(i)=='e'||s1.charAt(i)=='i'||s1.charAt(i)=='o'||s1.charAt(i)=='u'||s1.charAt(i)=='A'||s1.charAt(i)=='E'||s1.charAt(i)=='I'||s1.charAt(i)=='o'||
	 s1.charAt(i)=='U')
		{
		
        System.out.println("vowel:"+s1.charAt(i));
		}
	else
	{
		System.out.println("non vowels:"+s1.charAt(i));
		
	}
	
	}
	
  
	
	
	}
}
