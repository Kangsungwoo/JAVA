package ITAcademy.june.day12;

public class EnumMethodExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//name()메소드
		Week today = Week.SUNDAY;
		String name = today.name();
		System.out.println(name);
		
		//ordinal()메소드
		int ordinal = today.ordinal();
		System.out.println(ordinal);
		//compareTo() 메소드
		Week day1 = Week.MONDAY;
		Week day2 = Week.WEDNESDAY;
		int result1 = day1.compareTo(day2);
		int result2 = day2.compareTo(day1);
		System.out.println(result1);
		System.out.println(result2);
		
		//valueOf() 메소드
		if(args.length== 1) {
			String strDay = args[0];
			YOIL weekDay = YOIL.valueOf(strDay);
			if(weekDay == YOIL.토요일 || weekDay == YOIL.일요일) {
				System.out.println("주말 이군요");
			}else {
				System.out.println("평일 이군요");
			}
		}
		
		//values()메소드
		Week[] days = Week.values();
		for(Week day : days) {
			System.out.println(day);
			
		}
	}

}
