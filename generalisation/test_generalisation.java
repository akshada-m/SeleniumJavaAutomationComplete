package generalisation;

public class test_generalisation 
{
public static void main(String[] args) 
{
	System.out.println("--------jio features----------");
	jio j=new jio();
	j.audiocalling();
	j.sms();
	j.internet();
	j.newfeatureA();
	
	System.out.println("--------Airtel features----------");
airtel a=new airtel();
a.audiocalling();
a.sms();
a.internet();
a.newfeatureB();

System.out.println("--------Vi features----------");
Vi v=new Vi();
v.audiocalling();
v.sms();
v.internet();
v.newfeatureC();

}
}
