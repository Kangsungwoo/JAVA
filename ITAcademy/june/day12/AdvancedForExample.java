package ITAcademy.june.day12;

public class AdvancedForExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores = {95, 71, 84, 93, 87};
		
		int sum = 0;
		for (int score : scores) {  //for int score Ÿ�Ժ���  , scores�迭
			sum = sum + score;
			}
		System.out.println("���� ���� ="+ sum);
		
		double avg = (double) sum / scores.length;  
		System.out.println("���� ��� = " + avg);
		
	}

}
