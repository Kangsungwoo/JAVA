package ITAcademy.june.day13;

import java.util.*;

public class TestExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int input = 0;
		int sum = 0;
		do {
			System.out.println("���� ������ �Է��ϼ���");
			input = sc.nextInt();
			if(input %2 == 0) {
			sum+=input;
	}
			
	}	while(input>=0);  
	
		
		System.out.println(sum);
	}

}