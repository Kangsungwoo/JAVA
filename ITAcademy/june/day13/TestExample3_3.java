package ITAcademy.june.day13;

import java.util.Scanner;

public class TestExample3_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int x, sum = 0;
		
		do {
			System.out.println("양의 정수를 입력하세요");
			x= in.nextInt();
			if(x %2 == 0)
				sum += x;
		}while(x > 0);
		System.out.println("입력한 양의 정수 중에서 짝의 합은 "+ sum);
	
	}

}
