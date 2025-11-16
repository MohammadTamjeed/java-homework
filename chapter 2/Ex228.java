
package ex2.pkg2.pkg8;
import java.util.Scanner;
public class Ex228 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter v0");
        double v0 = sc.nextDouble();
        System.out.println("Ente the v1");
        double v1 = sc.nextDouble();
        System.out.println("Enter the time");
        double t = sc.nextDouble();
        double volcity = (v1-v0)/t;
        System.out.println(volcity);
    }

}
