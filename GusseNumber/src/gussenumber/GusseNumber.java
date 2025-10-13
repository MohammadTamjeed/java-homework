
package GusseNumber;
import java.util.Scanner;

public class GusseNumber {

    
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
        System.out.println("enter your guessed number"); 
         int number=(int) (Math.random()*100);
        while(true){ int num1=input.nextInt();
      
  if(num1==number ){System.out.println("your gussed number is correct");
  break;}
      else if(num1>number){System.out.println("your gussed number is too long "); }       
      else{System.out.println("too small");}  
              
              
        }
              
              }

     }
   
