package ITAcademy.june.day20;

public class ParentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p = new Parent();
		p.name = "parent";
		p.printInfo(); //p가 상위 클래스의 객체 ,parent 예정의된대로 name 출력
		System.out.println("-----------");
		Child c = new Child();
		c.name = "Child";
		c.setHobby("swimming");
		c.printInfo();  
	}

}
