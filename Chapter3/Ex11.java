
package ex11;
import java.util.Scanner;
public class Ex11 {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in );  
        System.out.println("Enter the month");
        int number_of_month = sc.nextInt();
        System.out.println("Enter the year");
        int year = sc.nextInt();
        if(number_of_month==1){
            System.out.println("junuary "+year+" has 31 days");
        }
        else if (number_of_month==2){
            System.out.println("february "+year+" has 28 days ");
        }
        else if (number_of_month==3){
            System.out.println("March "+year+" has 31 days ");
        }
        else if (number_of_month==4){
            System.out.println("April "+year+" has 30 days ");
        }
        else if (number_of_month==5){
            System.out.println("may "+year+" has 31 days ");
        }
        else if (number_of_month==6){
            System.out.println("june "+year+" has 30 days ");
        }
        else if (number_of_month==7){
            System.out.println("july "+year+" has  31 days ");
        }
        else if (number_of_month==8){
            System.out.println("August "+year+" has 31 days ");
        }
        else if (number_of_month==9){
            System.out.println("Septemper "+year+" has 30 days ");
        }
        else if (number_of_month==10){
            System.out.println("October "+year+" has 31 days ");
        }
        else if (number_of_month==11){
            System.out.println("November "+year+" has 30 days ");
        }
        else if (number_of_month==12){
            System.out.println("December "+year+" has 31 days ");
        }
    }

}
