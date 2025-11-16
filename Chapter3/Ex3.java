
package ex3;
import java.util.Scanner;
public class Ex3 {

    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        System.out.println("Enter the a value");
        double a = sc.nextDouble();
        System.out.println("Enter the b value");
        double b = sc.nextDouble();
        System.out.println("Enter the c value");
        double c = sc.nextDouble();
        System.out.println("Enter the d value");
        double d = sc.nextDouble();
        System.out.println("Enter the e value");
        double e = sc.nextDouble();
        System.out.println("Enter the f value");
        double f = sc.nextDouble();
        double condition = (a*d-b*c);
        if(condition==0){
            System.out.println("There is no solution ");
        }
        else{
        
        double result_x = (e*d-b*f)/(a*d-b*c);
        double result_y = (a*f-e*c)/(a*d-b*c);
        System.out.println("");
        System.out.println("The x result is "+result_x);
        System.out.println("");
        System.out.println("The y result is "+result_y);
    }
    }

}
