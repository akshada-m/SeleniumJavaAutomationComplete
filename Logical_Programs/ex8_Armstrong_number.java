package Logical_Programs;

public class ex8_Armstrong_number   //num=153    (1*1*1)+(5*5*5)+(3*3*3)=originalno=armstrong
{
	public static void main(String[] args) 
	{
	int orgnum=153;
	int armstrongnum=0;
	
	for(int i=orgnum;i>0;i=i/10)
	{
		int rem =i%10;
		armstrongnum=armstrongnum+(rem*rem*rem);
	}
	System.out.println("armstrong no is :"+armstrongnum);
	
		if(orgnum==armstrongnum) 
		{
			System.out.println("given no is armstrong");
		}
		else
		{
			System.out.println("given no is not armstrong");
		}
	}
}
