
package ex24;
import java.util.*;
public class Ex24 {

    public static void main(String[] args) {
     Random ra = new Random();
    String[] ranks = {"ASE","2","3","4","5","6","7","8","9","10","Jack","Queen","Queen","king"}; 
    String[] suits = {"Clubs"," Diamonds"," Hearts", "Spades"};
     int card = ra.nextInt(52);
     String rank = ranks[card%13];
     String suit = suits[card/13];
        System.out.println("The card you picked up is "+rank+" of "+suit+"!");
         
     }

}
