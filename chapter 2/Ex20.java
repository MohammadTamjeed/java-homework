
package ex20;
import java.util.Scanner;
public class Ex20 {

    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        System.out.println("Plaze enter your balance ");
        double balance = sc.nextDouble();
        System.out.println("Plaze enter your annual percentag");
        double annual_percentag = sc.nextDouble();
        double interest = balance *(annual_percentag/1200);
        System.out.println("your interest is for another month is  "+interest);
    }

}
