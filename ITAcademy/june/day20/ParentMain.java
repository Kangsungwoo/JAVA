package ITAcademy.june.day20;

public class ParentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p = new Parent();
		p.name = "parent";
		p.printInfo(); //p�� ���� Ŭ������ ��ü ,parent �����ǵȴ�� name ���
		System.out.println("-----------");
		Child c = new Child();
		c.name = "Child";
		c.setHobby("swimming");
		c.printInfo();  
	}

}
