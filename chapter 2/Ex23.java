
package ex21;
import java.util.Scanner;
public class Ex21 {

    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        System.out.println("Plaze enter your investment amount");
        double investmentAmount = sc.nextDouble();
        System.out.println("Plaze enter your annual intrest rste");
        double annual_interst_rate = sc.nextDouble();
        double monthlyInterestRate = (annual_interst_rate/12)/100;
        System.out.println("Plaze Enter number of year ");
        double number_of_year = sc.nextDouble();
        double futureInvestmentValue = investmentAmount *Math.pow((1+monthlyInterestRate),number_of_year *12);
        System.out.println(futureInvestmentValue);
    }

}
