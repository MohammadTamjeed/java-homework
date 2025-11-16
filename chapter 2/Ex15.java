package ex15;
import java.util.Scanner;
public class Ex15 {

    public static void main(String[] args) {
       Scanner sc =new Scanner(System.in);
        System.out.println("Enter the x1");
        double x1 =sc.nextDouble();
         System.out.println("Enter the x2");
        double x2 =sc.nextDouble();
         System.out.println("Enter the y1");
        double y1 =sc.nextDouble();
         System.out.println("Enter the y2");
        double y2 =sc.nextDouble();
        double distence = Math.pow(((x2-x1)+(y2-y1)),0.5);
        System.out.println(" "+distence);
    }

}