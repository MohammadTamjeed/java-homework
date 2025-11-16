//package season315;
// import java.util.Scanner;
//   public class Season315 {
//   
//     public static void main(String[] args) {
//        Scanner input = new Scanner (System.in);
//        int rand = (int)(Math.random()*999);//787
//        int digitr=rand/100;
//        int digitr2=(rand/10)%10;
//        int digitr3 =rand%10;
//         System.out.println("enter the three-digit integer:");
//         int me = input.nextInt();//878
//         int digitm=me/100;
//        int digitm2=(me/10)%10;
//        int digitm3=me%10;
//        if (digitr==digitm && digitr2 ==digitm2 && digitr3 == digitm3){System.out.println(rand+"  All digit Match you win 10000$");}
//        else if(digitr==digitm && digitr2 == digitm2 && digitr3!=digitm3){System.out.println(rand+"  two digit match you won 2500$");}
//        else if (digitr == digitm && digitr2 != digitm2 && digitr3!=digitm3){System.out.println(rand+"  one digit match you win 1000$");}
//        else if (digitr3==digitm && digitr2 ==digitm2 && digitr == digitm3){System.out.println(rand+" all match but reverse");}
//        else if ((digitr==digitm || digitr==digitm2||digitr==digitm3) || (digitr2==digitm || digitr2==digitm2||digitr2==digitm3 )||(digitr3==digitm || digitr3==digitm2||digitr3==digitm3)){
//            System.out.println(rand+" one digit match you win 1000$ ");}
//        else if((digitr== digitm && digitr==digitm2)|| (digitr==digitm && digitr==digitm3)||(digitr==digitm2 && digitr ==digitm3)){System.out.println("two digit match you won 3500");}
//         else if((digitr2== digitm2 && digitr2==digitm)|| (digitr2==digitm && digitr2==digitm3)||(digitr2==digitm2 && digitr ==digitm3)){System.out.println("two digit match you won 3500");}
//        else {System.out.println(rand+" nothing match you won nothing");}
//        
//   
//   }
//    
//}



import java.util.Scanner;

public class Season315 {
    public static void main(String[] args) {
        int lottery = (int)(Math.random() * 1000); // عدد لاتاری سه رقمی
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your lottery pick (three digits): ");
        int guess = input.nextInt();

        int lotteryDigit1 = lottery / 100;
        int lotteryDigit2 = (lottery / 10) % 10;
        int lotteryDigit3 = lottery % 10;

        int guessDigit1 = guess / 100;
        int guessDigit2 = (guess / 10) % 10;
        int guessDigit3 = guess % 10;

        System.out.println("The lottery number is " + lottery);

        if (guess == lottery) {
            System.out.println("Exact match: you win $10,000");
        } else if ((guessDigit1 == lotteryDigit2 || guessDigit1 == lotteryDigit3) &&
                   (guessDigit2 == lotteryDigit1 || guessDigit2 == lotteryDigit3) &&
                   (guessDigit3 == lotteryDigit1 || guessDigit3 == lotteryDigit2)) {
            System.out.println("All digits match: you win $3,000");
        } else if (guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2 || guessDigit1 == lotteryDigit3 ||
                   guessDigit2 == lotteryDigit1 || guessDigit2 == lotteryDigit2 || guessDigit2 == lotteryDigit3 ||
                   guessDigit3 == lotteryDigit1 || guessDigit3 == lotteryDigit2 || guessDigit3 == lotteryDigit3) {
            System.out.println("One digit match: you win $1,000");
        } else {
            System.out.println("No match: you win nothing");
        }
    }
}
