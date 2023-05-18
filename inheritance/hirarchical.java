package inheritance;

public class hirarchical 
{
public static void main(String[] args) 
{
	System.out.println("properties of son 1");
	son1 s1=new son1();
	s1.mobile();
	s1.car();
	s1.house();
	s1.money();
	
	System.out.println("properties of son 2");
	son2 s2=new son2();
	s2.laptop();
	s2.car();
	s2.house();
	s2.money();
	
	System.out.println("properties of son 3");
	son3 s3=new son3();
	s3.pc();
	s3.car();
	s3.house();
	s3.money();
}
}
