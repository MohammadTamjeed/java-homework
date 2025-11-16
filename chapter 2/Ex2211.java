
package ex2.pkg211;
import java.util.Scanner;
public class Ex2211 {

    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of year");
        int year = sc.nextInt();
        int brith = year*(31536000+ 312032486);
        System.out.println(brith);
    }

}
