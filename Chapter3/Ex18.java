
package ex18;
import java.util.*;
public class Ex18 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the wight of pachage");
        double package_wight = sc.nextInt();
        double shippin_cost = 0;
        if(package_wight>0 && package_wight<=1){
          shippin_cost =  package_wight /3.5;
            System.out.println("Your shipping cost is "+shippin_cost);
        }
        else if(shippin_cost>1 && shippin_cost<=3){
            shippin_cost = package_wight /5.5;
             System.out.println("Your shipping cost is "+shippin_cost);
        }
        else if(package_wight>3 && package_wight<=10){
            shippin_cost = package_wight /8.5;
             System.out.println("Your shipping cost is "+shippin_cost);
        }
        else if (package_wight>10 && package_wight<=20){
            shippin_cost = package_wight/10.5;
             System.out.println("Your shipping cost is "+shippin_cost);
        }
        else if (package_wight<=0){
            System.out.println("Invalid input");
        }
        else{
            System.out.println("“The package cannot be shipped");
        }
        
    }

}
