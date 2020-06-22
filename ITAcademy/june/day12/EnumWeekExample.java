package ITAcademy.june.day12;
import java.util.Calendar;
public class EnumWeekExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Week today = null;
		
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		switch(week) {
		case 1:
			today = Week.SUNDAY; break;
		case 2:
			today = Week.MONDAY; break;
		case 3:
			today = Week.TUESDAY; break;
		case 4:
			today = Week.WEDNESDAY; break;
		case 5:
			today = Week.THURSDAY; break;
		case 6:
			today = Week.FRIDAY; break;
		case 7:
			today = Week.SATURDAY; break;
		}
		System.out.println("오늘 요일:" + today);
		
		if(today == Week.SUNDAY) {
			System.out.println("일요일에는 축구를 합니다.");
		}else {
			System.out.println("열심히 자바 공부를 합니다.");
		}
		
		
		YOIL j = null;
		switch(week) {
		case 1:
			j = YOIL.일요일; break;
		case 2:
			j = YOIL.월요일; break;
		case 3:
			j = YOIL.화요일; break;
		case 4:
			j = YOIL.수요일; break;
		case 5:
			j = YOIL.목요일; break;
		case 6:
			j = YOIL.금요일; break;
		case 7:
			j = YOIL.토요일; break;
		}
		
		
		Calendar A = Calendar.getInstance();
		int year = A.get(Calendar.YEAR);
		int month = A.get(Calendar.MONTH) + 1;
		int day = A.get(Calendar.DAY_OF_MONTH);
		int YOIL = A.get(Calendar.DAY_OF_WEEK);
		int hour = A.get(Calendar.HOUR);
		int minute = A.get(Calendar.MINUTE);
		int second = A.get(Calendar.SECOND);
		
		System.out.println(year+"년 "+month+"월 "+day+"일 "+j +"\n"+hour+"시간 "+minute+"분 "+second+"초");
		
		
	}
	
	

}
