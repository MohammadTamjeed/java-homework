
package ex2.pkg2.pkg7;
import java.util.Scanner;
public class Ex227 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the offset ");
        long offset = sc.nextInt();
        long totalmillisecond = System.currentTimeMillis();
        long totalsecond = totalmillisecond/1000;
        long currentsecond = totalsecond%60;
        long totalminute = totalsecond/60;
        long currentminute = totalsecond%60;
        long totalhour = totalminute/60;
        long currenthour = (totalminute%24)+offset;
        System.out.println("the current time is "+currenthour+":"+currentminute+":"+currentsecond);
        
    }

}
