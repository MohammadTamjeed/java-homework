
package ex19;
import java.util.Scanner;
public class Ex19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the vlaue of (a) for triangle");
        double a = sc.nextDouble();
        System.out.println("Enter the vlaue of (b) for triangle");
        double b = sc.nextDouble();
        System.out.println("Enter the vlaue of (c) for triangle");
        double c = sc.nextDouble();
        if((a+b>c) && (a+c>b) && (b+c>a) ){
        double perimeter = (a+b+c);
            System.out.println("The perimeter a triangle is "+perimeter);
        }
        else{
            System.out.println("Input is invaild");
    }
    }

}
