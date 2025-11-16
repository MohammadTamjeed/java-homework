
package ex2.pkg2.pkg4;
import java.util.Scanner;
public class Ex224 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the pound ");
        double pound = sc.nextDouble();
        double killoMeter = pound*0.454;
        System.out.println("the "+pound+" to "+killoMeter+" kilometer is "+killoMeter);
    }

}
