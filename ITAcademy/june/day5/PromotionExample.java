package ITAcademy.june.day5;

public class PromotionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte byteValue = 10;
		int intValue = byteValue; //int <- byte
		System.out.println(intValue);
		
		char charValue = '가';
		intValue = charValue;  //int <- char
		System.out.println("가의 유니코드 =" + intValue);
		
		intValue = 500;
		long longValue = intValue;   //long <- int
		System.out.println(longValue);
		
		intValue = 200;
		double doubleValue = intValue;  //double <- int
		System.out.println(doubleValue);
		
	
	}

}
