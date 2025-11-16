
package ex1;
import java.util.*;
public class Ex1 {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.println("the length from the center of a pentagon to a vertex ");
        double r = sc.nextDouble();
        
        double s = 2 * r*Math.sin(Math.PI/5);
        double area =( 5*s*s)/(4*Math.tan(Math.PI/5));
        System.out.printf("The area of the pentagon is %.2f\n",area);
       System.out.printf("The area of the pentagon is %.2f\n", area);
        

    }

}
