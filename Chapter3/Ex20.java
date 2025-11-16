
package ex20;
import java.util.Scanner;
public class Ex20 {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.println("Enter the tempeture");
        int tempeture = sc.nextInt();
        System.out.println("Enter the wind speed");
        int wind_speed = sc.nextInt();
        if((tempeture>-58  && tempeture<41)  && (wind_speed>=2)){
            double wind_chill_temperature = 0;
             wind_chill_temperature = 35.74 + 0.6215*tempeture - 35.75*(Math.pow(wind_speed,0.16)) + 0.4275*tempeture *(Math.pow (wind_speed ,0.16));
             System.out.println("Wind Chill Temperature is for "+tempeture+" tempeture and "+wind_speed+" Wind Speed is "+wind_chill_temperature);
        }
        else {
            System.out.println("invaild value");
        }
    }

} 
