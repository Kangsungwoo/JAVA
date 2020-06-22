package ITAcademy.june.day6;

public class Example{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 5, y = 5, z=0;
		
		z = ++x + y++;
		//x =6  , y = 6 , z = 11 
		System.out.println("x= " + x);
		System.out.println("y= " + y);
		System.out.println("z= " + z);
		System.out.println();
		
		z = x++ + ++y;
		//x =7  , y = 7 , z = 13 
		System.out.println("x= " + x);
		System.out.println("y= " + y);
		System.out.println("z= " + z);
		System.out.println();
		
		z = ++x + --y + 10;
		//x = 8 , y = 6 , z = 24 
		System.out.println("x= " + x);
		System.out.println("y= " + y);
		System.out.println("z= " + z);
		System.out.println();
		
		
		z = x-- + --y;
		//x = 7 , y = 5 , z = 13  
		System.out.println("x= " + x);
		System.out.println("y= " + y);
		System.out.println("z= " + z);
		System.out.println();
		
		z = --x + y--;
		//x = 6 , y = 4 , z = 11 
		System.out.println("x= " + x);
		System.out.println("y= " + y);
		System.out.println("z= " + z);
		System.out.println();
	}

}
