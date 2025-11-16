
package ex14;
import java.util.*;
public class Ex14 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
      Random ra = new Random();
      int tell = ra.nextInt(2);
        System.out.println("Guess a number between (0,1) 0=tail  and 1=heads");
        int guess= sc.nextInt();
        if(guess==tell){
            System.out.println("Wow you won");
        }
        else{
            System.out.println("You field");
        }
      
    }

}
