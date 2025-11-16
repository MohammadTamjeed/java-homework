
package ex24;
import java.util.Scanner;
public class Ex24 {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Plaze enter the distance for drive ");
         double distance_drive = sc.nextDouble();
         System.out.println("Plaze enter the fuel of the car per galln");
         double fuel_per_galln = sc.nextDouble();
         System.out.println("Plaze enter price per galln ");
         double price_per_galln = sc.nextDouble();
         double cost_drive = (distance_drive/fuel_per_galln)*price_per_galln;
         System.out.println("the total cost is "+cost_drive);
    }

}
