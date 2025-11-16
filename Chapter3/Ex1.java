
package ex1;
import java.util.Scanner;
public class Ex1 {

    public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
        System.out.println("Plaze Enter the value of  a ");
        double a = sc.nextInt();
        System.out.println("Plaze Enter the value of b");
        double b = sc.nextInt();
        System.out.println("Plaze Enter the value of c");
        double c = sc.nextInt();
        double r =b*b-4*a*c;
        double r1 = (-b+Math.pow(r, 0.5))/2*a;
        double r2 = (-b-Math.pow(r,0.5))/2*a;
        System.out.println("r1 = "+r1);
        System.out.println("r2 = "+r2);
        if(r>0){
            System.out.println("It has two root");
        }
        else if (r==0){
        System.out.println("It has one root ");
    }
        else{
            System.out.println("It has not root");
        }
    }

}
