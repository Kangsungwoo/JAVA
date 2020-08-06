package ITAcademy.june.day20;

public class UpCastingChild extends UpCastingParent {
	private int z; //클래스 멤버변수 x,y,z
	
	public UpCastingChild() { 
		x=100;
		y=200;
		z=300;
				
	}
	@Override
	public int add() {
		System.out.println("child의 add()");
		return x + y + z;
	}
	
	
	public int sub() {
		System.out.println("child이 sub()");
		return x - y- z;
	}
	public int getZ() {
		return z;
    }
	public void setZ(int z) {
		this.z= z;
	}
}
