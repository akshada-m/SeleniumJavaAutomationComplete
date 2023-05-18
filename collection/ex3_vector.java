package collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;//legacy class

public class ex3_vector 
{
public static void main(String[] args) 
    {
	Vector V= new Vector();
	V.add("Aishwarya");
	V.add(80.2f);
	V.add('A');
	V.add(450);
	V.add(null);
	V.add(100);
	
	System.out.println(V.size());
	System.out.println(V.capacity());
	System.out.println(V.contains('A'));//true
	System.out.println(V.isEmpty());//false
	
	System.out.println(V);
	V.add(4, "pass");
	System.out.println(V);//right shift
	
	V.remove(4);        //left shift
	System.out.println(V);
	
	V.set(4,"pass");
	System.out.println(V);
	
	System.out.println("-----------print vector info by using enumeration cursor------------");
	
	Enumeration enu = V.elements();
	while (enu.hasMoreElements())
	{
		System.out.println(enu.nextElement());
	}
         
    System.out.println("-----------print vector info by using iterator cursor------------");
    Iterator itr = V.iterator();
    while(itr.hasNext())
    {
    System.out.println(itr.next());	
    }
    
    System.out.println("-----------print vector info by using Listiterator cursor------------");
    ListIterator litr = V.listIterator();
    while(litr.hasNext())
    {
    	System.out.println(litr.next());
    }
    
    System.out.println("-----------print vector info by using  forloop------------");
	
    for(int i=0;i<=V.size()-1;i++)
    {
     System.out.println(V.get(i));
    }
    
    System.out.println("-----------print vector info by using  foreach loop------------");
	
    for(Object vr:V)
    {
     System.out.println(vr);
    }
    }


}
