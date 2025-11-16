
package sumthedigit;
import java.util.Scanner;
public class SumTheDigit {

    public static void main(String[] args) {
      Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number between 0-1000");
        int number = sc.nextInt();
        int sum=0;
        for(int i=1;i<=number;i++){
        int digit = number%10;
        sum+=digit;
      number=number/10;}
            System.out.println(sum);
        
    }

}
