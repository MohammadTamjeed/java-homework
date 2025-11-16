
package ex2.pkg2.pkg3;
import java.util.Scanner;
public class Ex223 {

    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        System.out.println("Enter the feet");
        double feet = sc.nextDouble();
        double meter = feet *0.305;
        System.out.println("the "+feet+" feet to meter is "+meter);
    }

}
