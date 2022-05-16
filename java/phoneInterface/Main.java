package java.phoneInterface;
public class Main {
    public static void main(String[] args) {
        SmartCamera c = new SmartCamera();
        c.changeAperture();
        c.showNumberShutter(5);      //can use even did not override in SmartCamera
        System.out.println(ICamera.currentLocalDateTime());
    }
}
