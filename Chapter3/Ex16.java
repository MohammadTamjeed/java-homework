
package ex16;
import java.util.*;
public class Ex16 {
    public static void main(String[] args) {
        Random ra =new Random();
        Scanner sc = new Scanner(System.in);
        int width = 100;
        int height = 200;
        int point_width =(int) ((ra.nextDouble()*width)-width/2);
        int point_height =(int) ((ra.nextDouble()*height)-height/2);
        System.out.println(" ("+point_width+") ("+point_height+")");
        
    }

}
