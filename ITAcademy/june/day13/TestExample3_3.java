package ITAcademy.june.day13;

import java.util.Scanner;

public class TestExample3_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int x, sum = 0;
		
		do {
			System.out.println("���� ������ �Է��ϼ���");
			x= in.nextInt();
			if(x %2 == 0)
				sum += x;
		}while(x > 0);
		System.out.println("�Է��� ���� ���� �߿��� ¦�� ���� "+ sum);
	
	}

}
