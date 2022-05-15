package java;
import java.util.Scanner;

public class DemoStatic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter price : ");
        double price = input.nextDouble();
        double totalPrice = price + (price * Utils.vatrate);  //can use vatrate sudenly!!
        System.out.printf("Total price = %.2f",totalPrice);
    }
}
