import java.util.*;
import java.lang.Math;
public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Power value N");
        int n = sc.nextInt();
        int power = 1;
        for(int i=1; i<=n; i++){
            if(n > 31){
                System.out.println("Please enter number below 32");
                break;
            }
            if(n <= 31){
                power = 2 * power;
            }
            System.out.println("Power of 2 ^ "+i+" =" +" "+power);
        }

    }
}
