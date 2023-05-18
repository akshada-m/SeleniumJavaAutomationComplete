package static_nonstatic_use;

public class ex 
{
public static void main(String[] args) {
	String s1="abd adj jksd shd lskd fd asjhhd akjdk dkfgk hefgy ajdf";
	String[] AllStr = s1.split(" ");
	for(int i=0;i<AllStr.length-1;i++)
	{
		String str = AllStr[i];
		if(str.charAt(0)=='a')
		{
			System.out.println(str);
		}
	}
	
}
}
