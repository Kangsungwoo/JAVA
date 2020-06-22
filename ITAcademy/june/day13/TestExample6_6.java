package ITAcademy.june.day13;

public class TestExample6_6 {

	public static void printStar(int x) {
		// TODO Auto-generated method stub
		for(int i = 1; i <= x; i++)
			System.out.print("*");
	}
	public static void main(String[] args) {
		for(int i = 1; i <= 5; i++) {
			printStar(i);
			System.out.println();
	}
	}
}
