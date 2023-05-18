package logical_program_practise;

import java.util.HashMap;
import java.util.Set;

public class maveric {
	public static void main(String[] args) 
	{
		String str="Big black bug bit a big black dog on his big black nose";
		String[] as = str.split(" ");
		HashMap< String,Integer> mp=new HashMap<String, Integer>();
		for (int i=0;i<=as.length-1;i++)
		{
			String st = as[i];
			if(mp.containsKey(st))
			{
				mp.put(st,mp.get(st)+1);
			}
			else
			{
				mp.put(st,1);
			}
		}
		Set<String> allkeys = mp.keySet();
		for(String key:allkeys)
		{
			if(mp.get(key)>1)
			{
			System.out.println(key);
			}
		}
		
		
	}
}

