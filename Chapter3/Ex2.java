
package ex2;
import java.util.Scanner;
import java.util.Random;
public class Ex2 {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      Random ra = new Random();
      int num1 = ra.nextInt(0,9);
      int num2 = ra.nextInt(0,9);
      int num3 = ra.nextInt(0,9);
        System.out.println("what is addtion "+num1+"+"+num2+"+"+num3+" ? ");
        int result = sc.nextInt();
        if(num1+num2+num3==result){
            System.out.println("Welldone it is correct number ");
        }
        else{
            System.out.println("Tey agin it is not correct ");
        }
    }

}
