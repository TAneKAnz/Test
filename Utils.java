public class Utils {
    public static float vatrate = 0.07f;  //static field

    public static String capitalizeName(String name) {
        return name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
    }
}
