
package ex25;

import java.util.Scanner;

public class Ex25 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x1");
        int  x1 = sc.nextInt();
        System.out.println("Enter the value of y1");
        int  y1 = sc.nextInt();
                 System.out.println("Enter the value of x2");
        int  x2 = sc.nextInt();
        System.out.println("Enter the value of y2");
        int  y2 = sc.nextInt();
         System.out.println("Enter the value of x3");
        int  x3 = sc.nextInt();
          System.out.println("Enter the value of y3");
        int  y3= sc.nextInt();
        System.out.println("Enter the value of x4");
        int x4 = sc.nextInt();
        System.out.println("Enter the value of y4");
        int y4 = sc.nextInt();
        double a1 = y1-y2;
        double b1 = x2-x1;
        double c1 = a1*x1 + b1 *y1;
        double a2 = y3-y4;
        double b2 = x4-x3;
        double c2 = a2 * x3 + b2 *y3;
        double d = a1 * b2 - a2 *b1;
        double x =0 ;
        double y = 0;
        if(d==0){
            System.out.println(" the two lines are parallel");
        }
        else {
            x = (c1*b2-c2*b1)/d;
            y = (a1*c2-a2*c1)/d;
            System.out.println(" the intersecting point ("+x+","+y+")");
        }        
    }

}
