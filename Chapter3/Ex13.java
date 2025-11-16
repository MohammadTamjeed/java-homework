
package ex13;
import java.util.*;
public class Ex13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("If you are man-1");
        System.out.println("If you are woman-2");
        int status = sc.nextInt();
        int tax = 0;
        if(status==1){
            System.out.println("Enter you income");
            int income = sc.nextInt();
            if(income<=10000){
                tax = income*10/100;
                System.out.println("you tax is "+tax);
            }
            else if ((income>10000) &&(income<=20000 )){
                tax = income*15/100;
                System.out.println("you tax is "+tax);
            }
            else if((income>20000) && (income<=40000)){
                tax = income *20/100;
                System.out.println("you tax is "+tax);
            }
        }
        else if (status==2){
            System.out.println("Enter your income ");
            int income = sc.nextInt();
                   if(income<=10000){
                tax = income*5/100;
                System.out.println("you tax is "+tax);
            }
            else if ((income>10000) &&(income<=20000 )){
                tax = income*10/100;
                System.out.println("you tax is "+tax);
            }
            else if((income>20000) && (income<=40000)){
                tax = income *15/100;
                System.out.println("you tax is "+tax);
            }
        }
        
    }

}
