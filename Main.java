import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        demo1();
    }

    public static void demo1() {
        Person p1 = new Person();
        PersonName th = new PersonName("nai", "thanakan", "kanphairor");
        PersonName en = new PersonName("Mr.", "peter", "parker");
        p1.setThName(th);
        p1.setEnName(en);
        p1.setDob(LocalDate.of(2003, Month.FEBRUARY, 21));
        System.out.println(p1);
    }
}
