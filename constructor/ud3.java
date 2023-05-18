package constructor;

public class ud3         //1 constructor - example
{
int num1;
int num2;



ud3(int a,int b)
{
num1=a;
num2=b;
}
public void add()          //non static method add
{
	int sum=num1+num2;
	System.out.println(sum);
}




public static void main(String[] args) 
{
	ud3 d3=new ud3(20,6);
	d3.add();
	ud3 d4=new ud3(10,5);
	d4.add();
	
	System.out.println("----------------------------");
	
	ud4 d5=new ud4(3,9);
	d5.mul();
	d5.add();
	ud4 d6=new ud4(7,3);
	d6.mul();
}
}
