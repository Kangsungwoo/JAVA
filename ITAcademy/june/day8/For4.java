package ITAcademy.june.day8;

public class For4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j;
		//구구단 2~9단 출력
		for(i=2;i<=9;i++) {
			for(j=1;j<10;j++) {
				//System.out.println(i+"*"+j+"="+i*j);
				System.out.print(i+"*"+j+"="+i*j+"\t"); //"\t" 탭키
			}
			System.out.println();
		}
	}

}
