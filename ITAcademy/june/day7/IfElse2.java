package ITAcademy.june.day7;

public class IfElse2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 30, b = 10, c = 31;
		boolean flag = false;
		if(a>30) {
			System.out.println("a는 10보다 크다");
		}else {
			System.out.println("a는 10보다 크지않다");
		}
		
		if(a==20 && b>=10) {
			System.out.println("조건을 만족함");
		}else {
			System.out.println("조건을 만족하지 못함");
			}
		
		if(flag) {
			System.out.println("참");
		}else {
			System.out.println("거짓");
		}

		if(c<32) {
			System.out.println("c는 30보다 작기 때문에 조건이 틀리다");
		}else {
			System.out.println("c는 30보다 크기 때문에 조건이 맞다");
		}
}

}
