package Logical_Programs;

import java.util.HashMap;
import java.util.Set;

public class ex14_count_repeating_char_in_string_using_hashmap
{
	public static void main(String[] args) 
	{
		String s2="abccb";
		HashMap<Character,Integer> mp=new HashMap<Character,Integer>();
		
		for (int i =0; i<=s2.length()-1; i++) 
		{
		  char charkey = s2.charAt(i)	;
		  if(mp.containsKey(charkey))
			{
				mp.put(charkey, mp.get(charkey)+1);
			}
		  else
		  {
			  mp.put(charkey,1);
		  }
		  
		}
		
		Set<Character> allkeys = mp.keySet();
		for(Character one:allkeys)
		{
			System.out.println(one+" "+mp.get(one));
		}
		
		
		
				
	}
}
