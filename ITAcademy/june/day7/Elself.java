package ITAcademy.june.day7;
import java.util.Scanner;
public class Elself {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int jumsu;
		Scanner sc=new Scanner(System.in);
		System.out.println("점수를 입력하라"); 
		jumsu=sc.nextInt();  //sc. 마침표가 멤버접근연산자 = 요소지정 연산자 , nextInt 키보드로 정수형입력
		if(jumsu>=90) {
			System.out.println("A");
		}else if(jumsu>=80) {
			System.out.println("B");
		}else if(jumsu>=70) {
			System.out.println("C");
		}else if(jumsu>=60) {
			System.out.println("D");
		}else if(jumsu>=50) {
			System.out.println("F");
		}
		
	}
}
