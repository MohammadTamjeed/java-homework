
package ex19;

import java.util.Scanner;

public class Ex19 {

    public static void main(String[] args) {
       Scanner sc =new Scanner(System.in); 
        System.out.println("Ente the x1 ");
        double x1 = sc.nextDouble();
        System.out.println("Ente the x2 ");
        double x2 = sc.nextDouble();
        System.out.println("Ente the x3 ");
        double x3 = sc.nextDouble();
        System.out.println("Ente the y1 ");
        double y1 = sc.nextDouble();
        System.out.println("Ente the y2 ");
        double y2 = sc.nextDouble();
        System.out.println("Ente the y3 ");
        double y3 = sc.nextDouble();
        //==========================================
        double side1 = x1+y1;
        double side2 = x2+y2;
        double side3 = x3+y3;
        //===========================================
        double s = (side1+side2+side3)/2;
        double area;
        area = Math.sqrt((s*(s-side1)*(s-side2)*(s-side3)));
        System.out.println(area);
    }

}
