package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ex1_ArrayList {
public static void main(String[] args) {
	
	ArrayList al=new ArrayList();
	al.add("Akshada");
	al.add('A');
	al.add(null);
	al.add(null);
	al.add(70.2f);
	
	System.out.println(al);
    System.out.println(al.size());
    System.out.println(al.contains('A'));
    System.out.println(al.isEmpty());
    al.add(1,"mulik");            //right shift
    System.out.println(al);
    al.remove(1);                //left shift
    System.out.println(al);
    al.set(2, 100);                //update
    System.out.println(al);
    al.set(3, 200);
    System.out.println(al);
    System.out.println("------------print arraylist using while loop fetch by 1)iterator cursor------------");
   Iterator itr = al.iterator();
   
   while(itr.hasNext())
   {
	System.out.println(itr.next());   
   }
   
   System.out.println("------------print arraylist using while loop fetch by 2)listIterator cursor------------");
   ListIterator litr = al.listIterator();
   
   while(litr.hasNext())
   {
 	  System.out.println(litr.next());
   }
      
      System.out.println("------------print arraylist using for loop------------");
      
      for (int i=0;i<=al.size()-1;i++)
      {
    	  System.out.println(al.get(i));
      }
      
      System.out.println("------------print arraylist using for each loop------------");
      
      for(Object s1:al)
      {
    	  System.out.println(s1);
      }
      
      
      
}
}
