package ITAcademy.june.day19;

public class Parent {
	public String name;
	protected int age;
	private int money;
	
	public Parent() {
		System.out.println("Parent »ý¼ºÀÚ");
	}
	
	public void printParentlnfo() {
		System.out.println("name : " + name);
		System.out.println("age : " + age);
		
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}


}
