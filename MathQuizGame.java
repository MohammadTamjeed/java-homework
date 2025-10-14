
import java.util.Scanner;


public class MathQuizGame{

    public static void main(String[] args) {
     Scanner math=new Scanner(System.in);  
        System.out.println("enter your number1");  
        double num2=math.nextDouble();
        System.out.println("enter your opretion"); 
        String opretion=math.next();
        System.out.println("enter number2");
        double num1=math.nextDouble();
       
        switch(opretion){
            case"+":System.out.println(num1+num2);
        break;
        case"-":System.out.println(num2-num1);
        break;
        case"*":System.out.println(num2*num2);
        break;
        case"/":System.out.println(num2/num1);
        break;
        default:System.out.println("we can not do your opretion");
        
        
        
        }
        
    }



}