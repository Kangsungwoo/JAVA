package ITAcademy.june.day13;

public class TestExample5_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c;
		
		for(a = 1; a <= 20; a++) {
			for(b = 1; b <= 20; b++) {
				for(c = 1; c <= 20; c++) {
					if ( (c*c) == (a*a)+(b*b)  &&  (a+b+c) <=20 )
						System.out.printf("%2d,%5d,%10d\n",a,b,c);
				}  //%와 d사이에있는 2는 2칸 띄어쓰기 %d는 정수형
			}
		}
	}

}
