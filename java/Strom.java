package java;
public class Strom {
    public static String stromType(int speed) {
        String stromName = "";
        if (speed < 63) {
            stromName = "Depression";
        } else if (speed > 63 && speed < 118) {
            stromName = "Tropical strom";
        } else {
            stromName = "Typhoon";
        }
        return stromName;
    }
    public static void main(String[] args) {
        System.out.println(stromType(100));
    }
}
