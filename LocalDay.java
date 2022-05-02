import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class LocalDay {
    private LocalDate today = LocalDate.now();
    LocalDay() {
        System.out.println("My Method can help u to find the Day u want!!");
    }
    public void today() {
        System.out.println(today);
        System.out.println(today.getDayOfWeek());
        System.out.println(today.getDayOfYear());
    }
    public int until(int year, int month, int day) {
        LocalDate birthday = LocalDate.of(year, month, day);
        return (int) birthday.until(today, ChronoUnit.DAYS);
    }
}
