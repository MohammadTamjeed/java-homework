
package ex5;
import java.util.Scanner;
public class Ex5 {

    public static void main(String[] args) {
     Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number of today ");
        int today = sc.nextInt();
         System.out.println("Enter number of days afther today for a future day");
        int days_after = sc.nextInt();
        int future_day = (today +days_after)%7;
        if(today==6){
            System.out.println("Satrday");
        }
        else if (today==0){
            System.out.println("Sunday");     
        }
        else if (today==1){
            System.out.println("monday");            
        }
        else if (today==2){
            System.out.println("thusday");          
        }
        else if (today==3){
            System.out.println("wendsday");            
        }
        else if (today==4){
            System.out.println("thresday");           
        }
        else if (today==5){
            System.out.println("friday");            
        }
        if(future_day==6){
            System.out.println("The future day is satrday"); 
        }
        else if(future_day==0){
                   System.out.println("future day is sunday");
        }
        else if (future_day==1){
         System.out.println("future day is monday");   
        }
        else if(future_day==2){
           System.out.println("future day is thusday");   
        }
        else if (future_day==3){
         System.out.println("future day is wendsday");   
        }
        else if (future_day==4){
             System.out.println("future day is thersday");
        }
        else if (future_day==5){
            System.out.println("future day is Friday");
        }
    }

}
