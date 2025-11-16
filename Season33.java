
import java.util.Scanner;

public class Season33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // گرفتن مقادیر a, b, c, d, e, f از کاربر
        System.out.print("Enter a, b, c, d, e, f: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();

        // محاسبه دترمینانت
        double determinant = a * d - b * c;

        if (determinant != 0) {
            // حل با Cramer's Rule
            double x = (e * d - b * f) / determinant;
            double y = (a * f - e * c) / determinant;
            System.out.println("x is " + x + " and y is " + y);
        } else {
            System.out.println("The equation has no solution.");
        }
    }
}
