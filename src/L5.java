import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;

public class L5
{

	public static void main(String[] args)	//日期加減
	{
		String beforeDate = "20181012";
		int addDay = 20;
		String dateSum = DateComp(beforeDate, addDay);
		System.out.println(dateSum);
	}

	public static String DateComp(String strDate, int numDate)
	{
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		Date toDate;
		String afterDate = null;
		try
		{
			toDate = sdf.parse(strDate); // String TO Date型態
			cal.setTime(toDate); // Date TO Calendar
			System.out.println("Y=" + cal.get(Calendar.YEAR) );
			System.out.println("M=" + (cal.get(Calendar.MONTH)+1) );
			System.out.println("D=" + cal.get(Calendar.DAY_OF_MONTH) );
			cal.add(Calendar.DATE, numDate); // 日期相加
			afterDate = sdf.format(cal.getTime()); // Calendar TO String

		} catch (ParseException e)
		{
			e.printStackTrace();
		}
		return afterDate;
	}
}
