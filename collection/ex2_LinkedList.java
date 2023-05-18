package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class ex2_LinkedList 
{
    public static void main(String[] args) 
    {
		  LinkedList li=new LinkedList();       //worst choice:retrival operation :bcoz random access interface is not implemented in linkedlist 
		  li.add("Aishwarya");
		  li.add('A');
		  li.add(90.5f);
		  li.add(null);
		  li.add(450);
		  
		System.out.println(li);
		System.out.println(li.size());
		System.out.println(li.contains('B'));
		System.out.println(li.isEmpty());
		li.add(3, 100);
		System.out.println(li);            //no right shift happen only the index is changed or pointer position changed 
		li.remove(3);                      //no left shift :hence best choice for manipulation operation
		
		li.set(3, "pass");
		System.out.println(li);
		
		System.out.println("------------print LinkedList by using iterator-------------");
		
		Iterator itr = li.iterator();                
		while (itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("------------print LinkedList by using listiterator-------------");
		
		ListIterator litr = li.listIterator();
		while(litr.hasNext())
		{
			System.out.println(litr.next());
		}

		System.out.println("------------print LinkedList by using forloop-------------");
		for(int i=0;i<=li.size()-1;i++)
		{
			System.out.println(li.get(i));
		}

		
		System.out.println("------------print LinkedList by using for each loop-------------");
		for(Object L:li)
		{
			System.out.println(L);
		}

    }
}
