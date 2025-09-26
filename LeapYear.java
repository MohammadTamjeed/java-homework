import java.util.Scanner;

public class year {
public  static void main(String args[]) {
  Scanner input = new Scanner(System.in);

int year;
    System.out.print("Enter your year ");
    year = input.nextInt();
    if ( (year % 4 == 0 || year % 400 == 0) && year % 100 != 0 ){

        System.out.println("The year is a leap year");

    }
  else {
        System.out.println("The year is not a leap year");

    }

}
}
