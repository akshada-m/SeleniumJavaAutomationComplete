package methods;

public class string_para 
{
public static void main(String[] args) 
{
System.out.println("main method started");	

student_info("Akshada",450,'B',81.3f);
System.out.println("-------------------------");
student_info("aishwarya",550,'A',85.3f);
System.out.println("-------------------------");
student_info("rushikesh",650,'B',89.3f);
System.out.println("-------------------------");
student_info("suvarna",750,'A',99.3f);
System.out.println("-------------------------");
student_info("madhukar",850,'B',87.3f);




System.out.println("main method ended");	
}

public static void student_info(String sname,int rollno,char grade,float percentage)
{
	
	System.out.println(sname);
	System.out.println(rollno);
	System.out.println(grade);
	System.out.println(percentage);
	
	
	
	
	
}






}
