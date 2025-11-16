package season2.pkg13;
import java.util.Scanner;
public class Season213 {

    public static void main(String[] args) {
     Scanner input = new Scanner (System.in);
  System.out.println("Enter your amount which are in bank");
      double amount = input.nextDouble();     
        System.out.println("Enter the percentage of bank's privinsions  in the month");
        double percentage = input.nextDouble();
        System.out.println("Do you want to see the amount of your money after the time soo enter the time in month");
      int month = input.nextInt();
    percentage= (percentage/100) +1;      
      double content3= amount*Math.pow(percentage,month);
      
        System.out.printf("the amount of your money after  "+month+" month is equal too  %.2f \n  ", content3);
      
      }
      
        
    
    }
    

