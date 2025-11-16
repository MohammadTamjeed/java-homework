
package ex15;
import java.util.*;
public class Ex15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ra = new Random();
        System.out.println("Guess a three digit number");
        int num = sc.nextInt();
        int num_guess = ra.nextInt(100,1000);
        if(num==num_guess){
            System.out.println("Wow you won 10000 you telled exact number");
        }
        else if(num+2==num_guess || num-2==num_guess){
            System.out.println("you won 3000");
        }
        else{
            System.out.println("nothing");
        }
    }
       
    

}
