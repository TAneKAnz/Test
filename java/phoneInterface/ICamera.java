package java.phoneInterface;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public interface ICamera {
    void takePhoto();
    void changeAperture();
    void changeShutterSpeed();
    void deletePhoto();

    default void showNumberShutter(int num) {
        System.out.printf("shooting %d time\n", num);
    }

    static LocalDateTime currentLocalDateTime() {
        return LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
    }
}
