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
		System.out.println("���� ����:" + today);
		
		if(today == Week.SUNDAY) {
			System.out.println("�Ͽ��Ͽ��� �౸�� �մϴ�.");
		}else {
			System.out.println("������ �ڹ� ���θ� �մϴ�.");
		}
		
		
		YOIL j = null;
		switch(week) {
		case 1:
			j = YOIL.�Ͽ���; break;
		case 2:
			j = YOIL.������; break;
		case 3:
			j = YOIL.ȭ����; break;
		case 4:
			j = YOIL.������; break;
		case 5:
			j = YOIL.�����; break;
		case 6:
			j = YOIL.�ݿ���; break;
		case 7:
			j = YOIL.�����; break;
		}
		
		
		Calendar A = Calendar.getInstance();
		int year = A.get(Calendar.YEAR);
		int month = A.get(Calendar.MONTH) + 1;
		int day = A.get(Calendar.DAY_OF_MONTH);
		int YOIL = A.get(Calendar.DAY_OF_WEEK);
		int hour = A.get(Calendar.HOUR);
		int minute = A.get(Calendar.MINUTE);
		int second = A.get(Calendar.SECOND);
		
		System.out.println(year+"�� "+month+"�� "+day+"�� "+j +"\n"+hour+"�ð� "+minute+"�� "+second+"��");
		
		
	}
	
	

}
