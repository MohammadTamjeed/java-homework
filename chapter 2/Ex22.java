
package ex2.pkg2;
import java.util.Scanner;
public class Ex22 {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the cylinder redius");
        double redius = sc.nextDouble();
        System.out.println("Enter the cylider length");
        double length = sc.nextDouble();
        double area = redius * redius *Math.PI;
        double volume = area * length;
        System.out.println("the area of cylinder for "+redius+" redius and "+length+" length is "+area);
        System.out.println("the volume of cylinder for "+area+" area and "+length+" length is "+volume);
    }

}
