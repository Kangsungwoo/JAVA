package ITAcademy.june.day13;

public class TestExample5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c;
		for(a=1; a<19; a++) 
		{
			for(b=1; b<19; b++) 
			{
				for(c=1; c<19; c++) 
				{
					if ( (c*c) == (a*a)+(b*b)  &&  (a+b+c) <=20 )
					{
						System.out.println(a+"=a°ª  "+b+"=b°ª  "+c+"=c°ª  ");
						
					}
				}
						
			}		
					
		}
		
	}}		
		
					



