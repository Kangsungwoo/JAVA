package ITAcademy.june.day13;

import java.util.Scanner;

public class TestExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int input= 0;
		input = sc.nextInt();
		
		switch(input) {
		case 1:
			System.out.println("1등입니다. 아주 잘했습니다.");
			break;
		case 2:
		case 3:
			System.out.println("잘했습니다.");
			break;
		case 4:
		case 5:
		case 6:
			System.out.println("보통입니다.");
			break;
		 default:
		 System.out.println("노력해야겠습니다");
	}}
}

