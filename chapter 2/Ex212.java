
package ex2.pkg12;
import java.util.Scanner;
public class Ex212 {

    public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
        System.out.println("Enter v");
        double v = sc.nextDouble();
        System.out.println("Enter the a");
        double a = sc.nextDouble();
        double length = (v*v/2*a);
        System.out.println("the length of runway is "+length);
    }

}
