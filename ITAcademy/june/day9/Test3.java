package ITAcademy.june.day9;

public class Test3 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub

      int a=2, b=3, c=5;      //c 10 = 50 //b 9 = 27 //a 2 = 4
      int sum = 0;
      System.out.println("2g, 3g, 5g �߰� 10�� �� �ִ�. �̸� �����Ͽ� 81g�� ������. \n");

      BABO : for(int i/*2*/ = 0; i <=10; i++) 
      {
         for(int j/*3*/ = 0; j <= 10; j++) 
         {
            for(int k/*5*/=0; k<=10; k++) 
            {
               sum = (i*a) + (j*b) + (k*c);
               if(sum == 81) {
                  System.out.println("2g�� " + i + "   3g�� " + j + "   5g�� " + k);
                  System.out.println(sum);
                  System.out.println("�����Դϴ�");
                  System.out.println();
                  //break BABO;
               }
            }
         }
      }
      
      
      
   }

}