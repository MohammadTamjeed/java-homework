
package averagespeed;

public class AverageSpeed {

    public static void main(String[] args) {
     double mille = 24;
     double kilometers = mille * 1.6;
     double hour = 1 + (40/60)+(35/3600);
     
     double speed = kilometers/hour;
     
        System.out.println(speed);
    }

}
