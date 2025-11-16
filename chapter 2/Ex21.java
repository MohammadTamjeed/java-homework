
package ex2.pkg1;
import java.util.Scanner;
public class Ex21 {

    public static void main(String[] args) {
      Scanner sc =new Scanner(System.in);
        System.out.println("Enter he Celsius ");
        double celsius = sc.nextDouble();
        double fahrenhight = (9/5)*celsius + 32;
        System.out.println("the celsius "+celsius+" to fahrenhight is "+fahrenhight);
    }

}
