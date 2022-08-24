import java.util.*;
public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the specific year (Make sure its 4 digit number) ");
        int year = sc.nextInt();
        if((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)){
            System.out.println("year "+year +" is a Leap year");
        }
        else{
            System.out.println("year "+year+" is not a leap year");
        }

    }
}
