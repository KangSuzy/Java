package test;
import java.util.Calendar;
public class CalendarEx {
	public static void printCalendar(String msg, Calendar cal) {
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		int hour = cal.get(Calendar.HOUR);
		int hourOfDay = cal.get(Calendar.HOUR_OF_DAY);
		int ampm = cal.get(Calendar.AM_PM);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		int millisecond = cal.get(Calendar.MILLISECOND);
		
		System.out.print(msg + year + "/"+month+"/"+day+"/");
	
	switch(dayOfWeek) {
		case Calendar.SUNDAY : System.out.print("일"); break;
		case Calendar.MONDAY : System.out.print("월"); break;
		case Calendar.TUESDAY : System.out.print("화"); break;
		case Calendar.WEDNESDAY: System.out.print("수"); break;
		case Calendar.THURSDAY : System.out.print("목"); break;
		case Calendar.FRIDAY : System.out.print("금"); break;
		case Calendar.SATURDAY : System.out.print("토"); break;
	}
	System.out.print("("+hourOfDay+"시)");
	if(ampm == Calendar.AM) System.out.print("오전");
	else System.out.print("오후");
	System.out.print(hour + "시" + minute + "분" + second+"초" + millisecond + "밀리초");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar now = Calendar.getInstance();
		printCalendar("현재" , now);
		
		Calendar firstDate = Calendar.getInstance();
		firstDate.clear();
		firstDate.set(2012, 11, 25);
		
		firstDate.set(Calendar.HOUR_OF_DAY, 20);
		firstDate.set(Calendar.MINUTE, 30);
		printCalendar("처음 데이트 한날 ", firstDate);
	}

}
