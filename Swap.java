import java.util.*;
public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first value ");
        int A = sc.nextInt();
        System.out.println("Enter the Second value ");
        int B = sc.nextInt();
        int temp = 0;
        temp = A;
        A = B;
        B = temp;
        System.out.println(" Swap Two Numbers are ");
        System.out.println(A);
        System.out.println(B);
    }
}
