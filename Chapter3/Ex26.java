
package ex26;
import java.util.*;
public class Ex26 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a interger number");
        int num = sc.nextInt();
        boolean d5 = num%5==0;
        boolean d6 = num%6==0;
        System.out.println("is "+num+" divisible by 5 and 6 "+(d5 && d6));
           System.out.println("is "+num+" divisible by 5 or 6 "+(d5 || d6));
              System.out.println("is "+num+" divisible by 5 or 6 bot not both "+(d5 ^ d6));
    }
}