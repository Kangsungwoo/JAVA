package ITAcademy.june.day12;

public class AdvancedForExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores = {95, 71, 84, 93, 87};
		
		int sum = 0;
		for (int score : scores) {  //for int score 타입변수  , scores배열
			sum = sum + score;
			}
		System.out.println("점수 총합 ="+ sum);
		
		double avg = (double) sum / scores.length;  
		System.out.println("점수 평균 = " + avg);
		
	}

}
