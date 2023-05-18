package sample1;

import java.util.HashSet;
import java.util.Iterator;

public class program
{
	public static void main(String[] args)
	{
		//use:to remove duplicate elements when order of insertion is not mandatory.
	HashSet hs=new HashSet();
    hs.add("rahul");
    hs.add(100);
    hs.add('A');
    hs.add(65.5f);
    hs.add(100);//duplicate values are not allowed.
    hs.add(null);//allow only one null value
    hs.add(null);
    
    System.out.println(hs);//order of insertion is random.strorage type is hashtable.
    System.out.println(hs.isEmpty());//false
    System.out.println(hs.size());//5
    System.out.println(hs.contains(100));//true
    hs.remove('A');
    System.out.println(hs);
    hs.add('A');
    System.out.println(hs);
    
     System.out.println("-------print hashet info using iterator cursor----------");
     Iterator itr = hs.iterator();  
     while(itr.hasNext())
     {
    	 System.out.println(itr.next());
     }
     
   //we can't use for loop bcz there is no index concept
     
     System.out.println("-----print hashset info using for each loop-----");
     
     for(Object s1:hs)
     {
    	 System.out.println(s1);
     }
 
    }
}