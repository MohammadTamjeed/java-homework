package sessentwo2.pkg5;

  import java .util.Scanner;
    public class Seasontwo25 {
      public static void main(String[] args) {
        Scanner rate = new Scanner(System.in);
          System.out.println("enter the subtotal :");
           double subtotal = rate.nextDouble();
             System.out.println("enter the gratuity rate: ");
              double gratuity = rate.nextDouble();
                double total = subtotal * (gratuity/100);   
                  double total1= total+subtotal;
                    System.out.printf("the total rate is: %.2f$  and the gratuity is: %.2f$ : " ,total1 ,total );
    
    }
    
}
