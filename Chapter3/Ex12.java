
package ex12;
import java.util.*;
public class Ex12 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter a three-dight number");
        int num = sc.nextInt();
if(num>0){
    int orignal = num;
    int sum = 0;
    while(num>0){
        int dight = num%10;
         sum = sum * 10 +dight;
         num = num/10;
    }
    if(orignal==sum){
        System.out.println("palidrome");
    }
    else{
        System.out.println("not a palindrome");
    }    
}
else{
    System.out.println("false");
}
    }
}
