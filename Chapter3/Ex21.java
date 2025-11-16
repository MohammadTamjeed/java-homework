
package ex2.pkg1;
import java.util.Scanner;
public class Ex21 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in); 
        System.out.println("Enter a year ");
        int year = sc .nextInt();
        System.out.println("Enter a month ");
        int m = sc.nextInt();
        System.out.println("Enter day of the month");
        int q = sc.nextInt();
        int k = year%100;
        int j = year/100;
        if(m==1 || m==2){
            m+=12;
            year--;
        }
                int h = (q + 26*(m + 1)/10 + k + k/4 + j/4 + 5*j) %7;
        switch(h){
            case 0 :System.out.println("Day of the month is Saturday");
            break;
            case 1 :System.out.println("Day of the is month Sunday");
            break;
            case 2 :System.out.println("Day of the is month Monday");
            break;
            case 3 :System.out.println("Day of the is month Tuesday");
            break;
            case 4 :System.out.println("Day of the is month wendnesday");
            break;
            case 5 :System.out.println("Day of the is month Thuresday");
            break;
            case 6 :System.out.println("Day of the is month Friday");
            break;
        }
        
    }

}
