package ITAcademy.june.day5;

public class CastingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intValue = 44032;
		char charValue = (char) intValue;  //int ������ȯ
		System.out.println(charValue);
		
		long longValue = 500;
		intValue = (int) longValue;  //int������ ������ȯ
				System.out.println(intValue);
		
		double doubleValue = 3.14;
		intValue = (int) doubleValue; //������ ������ȯ
		System.out.println(intValue);
	}

}
