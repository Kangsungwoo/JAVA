package ITAcademy.june.day13;

public class TestExample7_7 {

	public static void foo(String str, int...a) {
		// TODO Auto-generated method stub
		System.out.print(str +" ");
		for (int i : a)
			System.out.print(i + " ");
		System.out.println();
		
	}
	public static void main(String args[]) {
		foo("æ»≥Á",1);
		foo("æ»≥Á«œººø‰",1 ,2);
		foo("¿ﬂ ¿÷æÓ");
	}
}
