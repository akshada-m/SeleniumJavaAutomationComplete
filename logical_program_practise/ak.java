package logical_program_practise;

public class ak 
{
	public static void main(String[] args) {
		int a=23000000;               //to count consecutive zero in num
		int count=0;
		for(int i=a;i>0;i=i/10)
		{
			int rem = i%10;
			if(rem==0)
			{
				count++;
			}
		}
		System.out.println(count);
	}

}
