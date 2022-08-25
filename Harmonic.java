import java.util.*;
public class Harmonic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Harmonic Number N");
        int n = sc.nextInt();
        double Series = 0.0;
        for(int i=n; i>0; i--){
            Series = Series + (double)1 / i;
            System.out.print(Series +" ,");
        }
       // System.out.println(Series);
    }
}
