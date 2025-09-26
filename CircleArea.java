import java.sql.SQLOutput;
import java.util.Scanner;
public class CircleArea {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double pi = 3.14159;


        System.out.print("Enter the radius of the circle :" );
    double radius1 = scanner.nextDouble();
        System.out.println("The area of the circle is "+ (pi*radius1*radius1));
    }

}




