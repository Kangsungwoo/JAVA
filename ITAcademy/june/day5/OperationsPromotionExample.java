package ITAcademy.june.day5;

public class OperationsPromotionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte byteValue1 = 10;
		byte byteValue2 = 20;
		//byte byteValue3 = byteValue1 + byteValue2; //�����Ϸ� ����
		int intValue = byteValue1 + byteValue2;
		System.out.println(intValue);
		
		char charValue1 = 'A';
		char charValue2 = 1;
		//char charValue3 = charValue1 + charValue2;  //�����Ϸ� ����
		int intValue2 = charValue1 + charValue2;
		System.out.println("�����ڵ�= "+ intValue);
		System.out.println("��¹���= "+ (char)intValue2);
		
		int intValue3 = 10;
		int intValue4 = intValue3/4;
		System.out.println(intValue4);
		
		int intValue5 = 10;
		//int intValue6 = 10 / 4.0  //�����Ϸ� ����
		double doubleValue = intValue5 / 4.0;
		System.out.println(doubleValue);
			
	}

}
