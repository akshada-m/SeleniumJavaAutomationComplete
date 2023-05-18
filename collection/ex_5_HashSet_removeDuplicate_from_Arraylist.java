package collection;

import java.util.ArrayList;
import java.util.HashSet;

public class ex_5_HashSet_removeDuplicate_from_Arraylist 
{
    public static void main(String[] args)
    {
		ArrayList al=new ArrayList();
		al.add("Akshada");
		al.add(100);
		al.add('A');
		al.add(78.0f);
		al.add(null);
		al.add(null);
		al.add(100);
		
		System.out.println(al);
		HashSet hs= new HashSet(al);
		System.out.println(hs);
	}
}
