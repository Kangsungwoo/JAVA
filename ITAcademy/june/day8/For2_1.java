package ITAcademy.june.day8;

public class For2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		System.out.println("1~100까지의 짝수");
		for(i=1;i<=100;i++) {
			if(i%2==0) { // if(i%2=1) 이것도 가능
				System.out.print(i+"\t");
			}
			if(i%10==0) {   //10 ,20,30,...
				System.out.println();
			}
		}
	}

}
