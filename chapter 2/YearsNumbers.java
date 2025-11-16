
package yearsnumbers;
import java.util.Scanner;
public class YearsNumbers {

    public static void main(String[] args) {
       Scanner sc =new Scanner(System.in);
        System.out.println("Enter the minutes");
        int minutes = sc.nextInt();
        int days_remen = minutes/1440;
        int years = days_remen/365;
        int days = days_remen%365;
        System.out.println("the "+minutes+" to year is "+years+" Years  and "+days+" Days");
    }

}
