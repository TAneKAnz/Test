import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LocalDay day = new LocalDay();
        //day.today();
        System.out.println("Enter your birthday : ");
        System.out.print("year = ");
        int y = input.nextInt();
        System.out.print("month = ");
        int m = input.nextInt();
        System.out.print("day = ");
        int d = input.nextInt();
        System.out.printf("you have been on earth for %d years.", day.until(y, m, d));
    }
}
