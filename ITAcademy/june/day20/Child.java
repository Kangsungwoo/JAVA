package ITAcademy.june.day20;

public class Child extends Parent {
		private String hobby;
		
		@Override //(재정의 어노테이션)컴파일러에 . 메서드를 재정의
		public void printInfo() {
			System.out.println("name : " + name);
			System.out.println("hobby : " + hobby);
			
		}
		
		public String getHobby() {
			return hobby;
		}
		public void setHobby(String hobby) {
			this.hobby = hobby;
		}
}
