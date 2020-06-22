package ITAcademy.june.day8;

public class For5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i, j, k, ex=0;
		
		for(i = 1; i<=5;i++)
		{
			for(j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	
		for(i=1; i<=4; i++)
		{
			for(j=4;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		//////////////////////////////////////
		System.out.println("--------------------");
		
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(k=5;k>=i;k--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		//////////////////////////////////////
		System.out.println("--------------------");
		
		for(i=1;i<=5;i++)
		{
			for(j=4;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		

		//////////////////////////////////////
		System.out.println("--------------------");
		
		for(i = 1; i <=5; i++)
		{
			for(j=4;j>=i;j--)
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
