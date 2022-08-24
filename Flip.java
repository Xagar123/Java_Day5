import java.util.*;
import java.lang.*;
public class Flip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("The number of time to flip coin");
        int n = sc.nextInt();
        double Head = 0;
        double Tail = 0;
        double percentage = 0;
        for(int i=0; i<n; i++) {
            int Flip = (int) Math.floor(Math.random() * 10) % 2;
            if (Flip == 0) {
                Head += 1;
            }
            if(Flip == 1){
                Tail += 1;
            }
        }
        percentage = (Head/Tail) * 100;
        System.out.println("Total number of Head = "+ Head);
        System.out.println("Total Number of Tail = "+ Tail);
        System.out.println("Percentage of head vs Tail is "+percentage);

    }
}
