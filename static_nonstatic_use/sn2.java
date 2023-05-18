package static_nonstatic_use;

public class sn2 
{
public static void main(String[] args) {
	sn1 akshada=new sn1();
	akshada.eid=100;
    akshada.esal=10000;
    sn1.eceoname="abc";
    
    sn1 rushi=new sn1();
	rushi.eid=100;
    rushi.esal=10000;
    sn1.eceoname="abc";
    
    sn1 aisha=new sn1();
	aisha.eid=100;
    aisha.esal=10000;
    sn1.eceoname="xyz";              //eceoname is a static variable so if we cahnge it for one method it will change for other merthod with latest one. 
    
    
    System.out.println("akshada info......");
    akshada.showinfo();
    System.out.println("rushi info......");
    rushi.showinfo();
    System.out.println("aisha info......");
	aisha.showinfo();
}
}
