package Logical_Programs;

import java.util.HashMap;
import java.util.Set;

public class ex16_Find_Repeating_String_in_paragraph
{
	public static void main(String[] args) 
	{
	String s1=" abc abc def def ghi"	;
	
	HashMap<String,Integer> mp=new HashMap<String, Integer>();
	String[] as= s1.split(" ");
	for(int i=0;i<=as.length-1;i++)
	{
		String strkey = as[i];
		if(mp.containsKey(strkey))
		{
			mp.put(strkey, mp.get(strkey)+1);
		}
		else
		{
			mp.put(strkey, 1);
		}
		
	}
	
	Set<String> allkeys = mp.keySet();
	for(String key:allkeys)
	{
//		if(mp.get(key)>1)
//		{
//			System.out.println(key+" "+mp.get(key));
//		}
		
		System.out.println(key+" "+mp.get(key));
	}
	
	
	
	
	}
}
