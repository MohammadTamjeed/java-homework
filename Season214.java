
package season2.pkg14;
import java.util.Scanner;
public class Season214 {

    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
        System.out.println("enter a side of hexagon ");
    double s = input.nextDouble();
    double area = (3*Math.sqrt(3)/2)*s*s;
        System.out.printf("the area of hexagon is equal too: %.4f ", area);
    
    
    }
    
}
