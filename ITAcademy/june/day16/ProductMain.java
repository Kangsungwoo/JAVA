package ITAcademy.june.day16;

public class ProductMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1; //��ü ���� p1
		p1 = new Product();
		p1.num = 1;  //�ʵ�
		p1.name = "��Ʈ��"; //�ʵ忡 �����Ҷ� .(��Ʈ)
		
		Product p2 = new Product();  //�ΰ��� ��ģ��  p2�� new
		p2.num = 2;
		p2.name = "TV"; //���ڿ�
		
		Product p3 = new Product();
		p3.num = 4;
		p3.name = "��ǻ��";  //�� ������ �Ȱǵ�� , ��ü������ ������� ����.
				
		
		System.out.println("��ü p1�� ���� ���");
		System.out.println("p1.num =" + p1.num);
		System.out.println("p1.name = " + p1.name);
		
		System.out.println("��ü p2�� ���� ���");
		System.out.println("p2.num = " + p2.num);
		System.out.println("p2.name " + p2.name);
		
		System.out.println("��ü p3�� ���� ���");
		System.out.println("p3.num = " + p3.num);
		System.out.println("p3.name " + p3.name);
		
		
	}

}
