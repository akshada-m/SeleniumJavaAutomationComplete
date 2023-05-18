package DemoJ;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class demo6_getDate 
{
	public static void main(String[] args)
	{
		GregorianCalendar date=new GregorianCalendar();
		int dd = date.get(Calendar.DAY_OF_MONTH);
		int mm = date.get(Calendar.MONTH)+1;
		int yy = date.get(Calendar.YEAR);
		
		System.out.println("current date is:"+dd+"/"+mm+"/"+yy);

	}
}
