
package ex27;

import java.util.Scanner;

public class Ex27 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x");
        double x = sc.nextInt();
        System.out.println("Enter the value of y");
        double y = sc.nextInt();
        if(x >= 0 &&( y >= 0 && y <= (- 0.5 * x + 100))){
            System.out.println("is inside");
        }
        else {
            System.out.println("Is outside");
        }
    }

}
