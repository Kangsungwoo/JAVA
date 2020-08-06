package ITAcademy.june.day20;

public class UpCastingParent {
		protected int x;
		protected int y;
		
		public UpCastingParent() { //생성자로 멤버 변수를 초기화
			x = 10;
			y = 20;
		}
		
		public int add() {  //멤버변수의 합을 변환하는 메서드를 정의.
			System.out.println("parent의 add()");
			return x + y;
		}
}
