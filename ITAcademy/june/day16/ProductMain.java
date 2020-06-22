package ITAcademy.june.day16;

public class ProductMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1; //객체 생성 p1
		p1 = new Product();
		p1.num = 1;  //필드
		p1.name = "노트북"; //필드에 접근할때 .(도트)
		
		Product p2 = new Product();  //두개를 합친거  p2와 new
		p2.num = 2;
		p2.name = "TV"; //문자열
		
		Product p3 = new Product();
		p3.num = 4;
		p3.name = "컴퓨터";  //즉 메인은 안건들고 , 객체가지고 결과값을 뽑음.
				
		
		System.out.println("객체 p1의 정보 출력");
		System.out.println("p1.num =" + p1.num);
		System.out.println("p1.name = " + p1.name);
		
		System.out.println("객체 p2의 정보 출력");
		System.out.println("p2.num = " + p2.num);
		System.out.println("p2.name " + p2.name);
		
		System.out.println("객체 p3의 정보 출력");
		System.out.println("p3.num = " + p3.num);
		System.out.println("p3.name " + p3.name);
		
		
	}

}
