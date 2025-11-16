
package ex10;
import java.util.*;
public class Ex10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ra = new Random();
        int num  = ra.nextInt(0,99);
        int num2 = ra.nextInt(0,99);
        System.out.println("What is number1 and number2 "+num+"+"+num2+" ?");
        int answer = sc.nextInt();
    
    if(answer==num+num2){
        System.out.println("Well done sir");
}
    else{
        System.out.println("Tri again");
    }
    }
}
