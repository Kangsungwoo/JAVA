package ITAcademy.june.day7;
import java.util.Scanner;
public class Elself {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int jumsu;
		Scanner sc=new Scanner(System.in);
		System.out.println("������ �Է��϶�"); 
		jumsu=sc.nextInt();  //sc. ��ħǥ�� ������ٿ����� = ������� ������ , nextInt Ű����� �������Է�
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
