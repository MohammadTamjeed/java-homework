
package ex22;

import java.util.Scanner;

public class Ex22 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of point (x)");
        double x = sc.nextDouble();
        System.out.println("Enter the value of point (y)");
        double y = sc.nextDouble();
        if(x*x + y*y <=100){
            System.out.println("point ("+x+","+y+") is Inside of circle");
        }
        else{
            System.out.println("point ("+x+","+y+") is Outside of the circle");
        }
    }

}
