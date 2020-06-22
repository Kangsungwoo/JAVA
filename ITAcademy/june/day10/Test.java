package ITAcademy.june.day10;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j, k, ex=0;
		for(i = 1; i <=6; i++)
		{
			for(j=5;j>=i;j--)
			{
				System.out.print(" ");
			}
			
			for(k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			for(ex=2;ex<=i;ex++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}
	}
	

