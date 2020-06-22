package ITAcademy.june.day13;

public class TestExample6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i <= 5; i++) {
			printStar(i);
			System.out.println();
		}
	}
	public static void printStar(int i) {
	int j = 0;
	
		for(j=0; j<i+1; j++) {
			System.out.print("*");
	}
	}

}
