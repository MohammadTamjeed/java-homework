
package ex9;
import java.util.*;
public class Ex9 {

    public static void main(String[] args) {
      Scanner sc =new Scanner(System.in);
        System.out.println("Enter number 1");
        int d1 = sc.nextInt();
        System.out.println("Enter number 2");
        int d2 = sc.nextInt();
        System.out.println("Enter number 3 ");
        int d3 = sc.nextInt();
        System.out.println("Enter number 4");
        int d4 = sc.nextInt();
        System.out.println("Enter number 5");
        int d5 = sc.nextInt();
        System.out.println("Enter number 6");
        int d6 = sc.nextInt();
        System.out.println("Enter number 7");
        int d7 = sc.nextInt();
        System.out.println("Enter number 8");
        int d8 = sc.nextInt();
        System.out.println("Enter number 9 ");
        int d9 = sc.nextInt();
        int isbn = (d1 + d2 *2+ d3 *3 + d4 * 4 + d5 *5+ d6*6 + d7 * 7 + d8 * 8 + d9*9)%11;
        if(isbn<10){
            System.out.println(" "+d1+" +d2+"+d3+"+d4+"+d5+"+d6+"+d7+"+d8+"+d9+""+isbn);
        }
        else if(isbn==10){
            System.out.println(" "+d1+" +d2+"+d3+"+d4+"+d5+"+d6+"+d7+"+d8+"+d9+"x");
        }
    }

}
