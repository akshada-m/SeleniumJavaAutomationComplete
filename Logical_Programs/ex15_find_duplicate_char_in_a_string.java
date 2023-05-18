package Logical_Programs;

import java.util.HashMap;
import java.util.Set;



public class ex15_find_duplicate_char_in_a_string
{
public static void main(String[] args)
{
String s1="aabccdff";

HashMap<Character,Integer> mp=new HashMap<Character, Integer>();

	for(int i=0;i<=s1.length()-1;i++)
	{
		char charkey = s1.charAt(i);
		if(mp.containsKey(charkey))
		{
			mp.put(charkey,mp.get(charkey)+1);
		}
		else
		{
			mp.put(charkey,1);
		}
		
	}
	
	Set<Character> allkeys = mp.keySet();
	for(Character key:allkeys)
	{
		if(mp.get(key)>1)
		{
			System.out.println(key+" "+mp.get(key));
		}
	}
	
	
}
}
