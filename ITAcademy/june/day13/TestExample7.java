package ITAcademy.june.day13;

public class TestExample7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		foo("안녕",1 );
		foo("안녕하세요", 1, 2);
		foo("잘 있어");
				
	}
	public static void foo(String a,int b) {
		System.out.println(a+" " +b);	
	}
	
	public static void foo(String a,int b,int c) {
		System.out.println(a+" " +b+" "+c);	
	}
	
	public static void foo(String f) {
		System.out.println(f);	
	}
	

}

/*
boolean i = 0; 1byte 
short b = 0;   2
int c = 0;     4
long d = 0L;   8
float e = 0F;  4
double f = 0;  8

char g = ' ';  2
String h = ""; 무제한 */