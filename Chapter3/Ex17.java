
package ex17;
import  java.util.*;
public class Ex17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ra = new Random();
        int com = ra.nextInt(3);
        System.out.println("guess a number between 0,1,2  zero for Scissor one for Rock and two for Paper");
        int num = sc.nextInt();
      if((num==0 && com==2) || (num==1 && com==0) || (num==2 && com==1)){
          System.out.println("You chise "+num+" and computer  chise "+com+" you won");
      }
      else if(num==com){
          System.out.println("Draw");
      }
      else{
          System.out.println("You lose");
      }
            
    }

}
