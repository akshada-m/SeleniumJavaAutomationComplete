package collection;

import java.util.ArrayList;
import java.util.TreeSet;

public class ex_8_generic 
{
  public static void main(String[] args) 
    {
	ArrayList<String>al=new ArrayList<String>();
	al.add("Akshada");
	al.add(null);
	al.add("Mulik");
	//al.add(100);
	//al.add('A');
	al.set(1, "Madhukar");
	
	System.out.println("----Print Arraylist using for each ----");
	for(String s1:al)
	{
		System.out.println(s1);
	}
	
	
	TreeSet<Character>tr=new TreeSet<Character>();
	tr.add('A');
	tr.add('C');
	tr.add('B');
	tr.add('F');
	tr.add('D');
	
	System.out.println(tr);
	
	System.out.println("-------print treeset info using for each loop----------");
	for(Character s2:tr)
	{
		System.out.println(s2);
	}
	
    }
}
