
package ex23;
import java.util.Scanner;
public class Ex23 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of point (x)");
        double x = sc.nextDouble();
        System.out.println("Enter the value of point (y)");
        double y = sc.nextDouble();
        //width=10,height=5 we need width/2 ,height/2;
        if((x<=5 && x>=-5)  && (y<=2.5 && y>=-2.5)){
            System.out.println("Is inside rectangle");
        }
        else{
            System.out.println("Outside of rectangle");
        }
    
    }

}
