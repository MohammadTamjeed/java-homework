
import java.util.Scanner;

public class Question {
    public static void main(String[] args) {
   Scanner quest=new Scanner(System.in);
   int count=0;
  int right=0;
  int wrong=0;
    while(count<4){     int num1=(int)(Math.random()*20);
     int num2=(int)(Math.random()*20);
   int result=num1+num2;
    System.out.println("what is "+num1+ "+"+num2);
   int last=quest.nextInt();
   if(last==result){System.out.println("your answer is correct");
   right++; }
   else{System.out.println("your answer is wrong");
       wrong++;
   }
        System.out.println("your right answer is "+right);
        System.out.println("your wrong answer is "+wrong);
    }
    }
    }
    

