package ITAcademy.june.day7;
import java.util.Scanner;
public class Elself2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int jumsu;
		Scanner sc=new Scanner(System.in);
		System.out.println("������ �Է��϶�");
		jumsu=sc.nextInt();
		if(jumsu>=90) {
			System.out.println("A");
		}else if(jumsu>=80) {
			System.out.println("B");
		}else if(jumsu>=70) {
			System.out.println("C");
		}else if(jumsu>=60) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
			
		
	}
}