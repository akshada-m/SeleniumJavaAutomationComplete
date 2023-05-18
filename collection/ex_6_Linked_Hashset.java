package collection;

import java.util.Iterator;
import java.util.LinkedHashSet;
//to remove duplicate info when order of insertion is mandatory
public class ex_6_Linked_Hashset 
{
    public static void main(String[] args) 
    {
		LinkedHashSet lhs=new LinkedHashSet();
		lhs.add("akshada");
		lhs.add(100);
		lhs.add('A');
		lhs.add(56.9f);
		lhs.add(100);
		lhs.add(null);
		lhs.add(null);
		
		System.out.println(lhs);//duplicate not allowed & order of insertion is maintained.
		lhs.add("mulik");
		System.out.println(lhs);
		lhs.remove("mulik");
		System.out.println(lhs);
		
		System.out.println(lhs.size());
	    System.out.println(	lhs.isEmpty());
	    System.out.println(lhs.contains('d'));
	    
	    System.out.println("-----print LinkedHashset info using iterator cursor -----");
	    Iterator itr =lhs.iterator();
	    while(itr.hasNext())
	    {
	    	System.out.println(itr.next());
	    }
	    System.out.println("-----print LinkedHashset info using for each loop -----");
	    for(Object s1:lhs)
	    {
	    	System.out.println(s1);
	    }
	    
	    System.out.println("----------");
	    lhs.clear();
	    System.out.println(lhs.isEmpty());
	    System.out.println(lhs.size());
	    
	    
	}
}
