package ITAcademy.june.day12;

public class Method2Param {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double myHeight = 179.3;
		int age= 33;
		int j = 31;
		double weight = 78.9;
		hiEveryone(j, age, myHeight, (float)weight);  //모르겠음
		
		byEveryone();
		
	}
	
	public static void hiEveryone(int i, int a, double b, float weight) {
		System.out.println("제 나이는 만으로" + i + "세 입니다.");
		System.out.println("제 나이는 " + a + "세 입니다.");
		System.out.println("저의 키는" + b + "cm 입니다.");
		System.out.println("제 몸무게는 "+ weight + "희망합니다.");
		System.out.println();
	}
	public static void byEveryone() {
		System.out.println("다음에 뵙겠습니다.");
	}

}
