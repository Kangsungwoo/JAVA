package ITAcademy.june.day7;
import java.util.Scanner;
public class SwitchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int grade;
		Scanner sc= new Scanner(System.in); //sc ��ü  new�޸��Ҵ�
		System.out.println("�г��� �Է��϶�");
		grade=sc.nextInt();  //������ �Է�
		switch(grade) { //grade ������
		case 1:
			System.out.println("1�г� �Դϴ�.");
			break;
		case 2:
			System.out.println("2�г� �Դϴ�.");
			break;
		case 3:
			System.out.println("3�г� �Դϴ�.");
			break;
		case 4:
			System.out.println("4�г� �Դϴ�.");
			break;
		default:
			System.out.println("�г��� �߸��Է��ϼ̽��ϴ�.");
			break;
			
			
		}
	}}
