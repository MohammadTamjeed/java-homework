
package ex.pkg8;
import java.util.Scanner;
public class Ex8 {

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();
        System.out.println("Enter thired number");
        int c = sc.nextInt();
        int temp= 0 ;
      if(a>b){
          temp = a; a = b ; b = temp;
      }
      if(a>c){
          temp = a; a = c; c = temp;
      }
      if(b>c){
          temp = b; b = c; c = temp;
      }
        System.out.println(" "+a+" "+b+" "+c+"");
    }

}
