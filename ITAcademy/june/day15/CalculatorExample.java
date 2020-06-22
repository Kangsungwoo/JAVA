package ITAcademy.june.day15;

public class CalculatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator myCalcu = new Calculator();
		
		//정사각형 넓이 구하기
		double result1 = myCalcu.areaRectangle(10);
		//직사각형 넓이 구하기
		double result2 = myCalcu.areaRactangle(10, 20);
		
		//결과값 출력
		System.out.println("정사각형 넓이 = " + result1);
		System.out.println("직사각형 넓이 = " + result2);
	}
}

