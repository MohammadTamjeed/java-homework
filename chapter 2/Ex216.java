
package ex2.pkg16;
import java.util.Scanner;
public class Ex216 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of of hexagon ");
        double side = sc.nextDouble();
        double area = (3*Math.pow(3,0.5)*side*side)/2;
        System.out.println(" the Area of hexagon is "+area);
                
    }

}
