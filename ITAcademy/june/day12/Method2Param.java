package ITAcademy.june.day12;

public class Method2Param {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double myHeight = 179.3;
		int age= 33;
		int j = 31;
		double weight = 78.9;
		hiEveryone(j, age, myHeight, (float)weight);  //�𸣰���
		
		byEveryone();
		
	}
	
	public static void hiEveryone(int i, int a, double b, float weight) {
		System.out.println("�� ���̴� ������" + i + "�� �Դϴ�.");
		System.out.println("�� ���̴� " + a + "�� �Դϴ�.");
		System.out.println("���� Ű��" + b + "cm �Դϴ�.");
		System.out.println("�� �����Դ� "+ weight + "����մϴ�.");
		System.out.println();
	}
	public static void byEveryone() {
		System.out.println("������ �˰ڽ��ϴ�.");
	}

}
