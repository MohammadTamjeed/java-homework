
package ex2.pkg2.pkg9;
import java.util.Scanner;
public class Ex229 {

    public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
        System.out.println("Enter the water in the killogram");
        double water = sc.nextDouble();
        System.out.println("Enter the initial tempture ");
        double inital = sc.nextDouble();
        System.out.println("Enter the final tempture ");
        double finLl = sc.nextDouble();
        double enrge = water*(inital-finLl)*4184;
        System.out.println(enrge);
    }

}
