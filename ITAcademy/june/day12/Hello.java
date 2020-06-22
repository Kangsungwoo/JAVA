package ITAcademy.june.day12;

public class Hello {
	int add(int a, int b) {
		int c = 0;
		c= a + b;
		return c;
	}
	void print() {
		System.out.println("hello");
	}
	int add1(int j, int k) {
		int i = 0;
		i = j + k;
		return i;
		}
	double doublefunc() {
		return 12.3;
	}

	
	
	public static void main(String[] args) {
		Hello h = new Hello();
		int c;
		c= h.add1(3,5);   //함수 호출문
		
		int i;
		i= h.add(5,9);
		System.out.println(c);
		System.out.println(i);
		h.print();
		double d = h.doublefunc();
		System.out.println(d);
}
		
}
