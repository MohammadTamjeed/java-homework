
package ex2.pkg2.pkg5;
import java.util.Scanner;
public class Ex225 {

    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        System.out.println("Enter teh subtotal");
        double subtotal = sc.nextDouble();
        System.out.println("Enter the gratuti");
        double gratuti = sc.nextDouble();
        double gratuti_rate = gratuti/subtotal;
        double subtotal_rate = (subtotal +(gratuti/100));
        System.out.println("the gratuti rate for "+subtotal+" and "+gratuti+" is "+gratuti_rate);
        System.out.println("the subtotal rate for "+subtotal+" and "+gratuti+" is "+subtotal_rate );
    }

}
