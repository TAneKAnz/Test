package java.constructor;
public class Main {
    public static void main(String[] args) {
        demo4();
    }

    public static void demo1() {
        Person p1 = new Person();
        p1.setFirstName("peter");
        p1.setLastName("parker");
        p1.setNickName("pete");
        p1.setGender("M");

    }

    public static void demo2() {
        Person p2 = new Person("peter", "parker", "pete", "M");
    }

    public static void demo3() {
        Person p3 = new Person("peter", "parker");
        System.out.println(p3.toString());
    }

    public static void demo4() {
        Patient p4 = new Patient();
        Patient t = new Patient("peter", "parker", "pete", "M", 175f, 70f);
        System.out.println(t.toString());
    }
}
