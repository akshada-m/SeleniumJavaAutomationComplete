package Access_specifier;

public class sample2
{
public static void main(String[] args)
{
	sample1 s1=new sample1();
	s1.m2();
	//s1.m1();       we cannot access private data member in diff class
	defaultas as=new defaultas();
	as.m4();
}
}