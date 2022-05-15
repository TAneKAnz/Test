package java;
public class ContactApp {
    public static void main(String[] args) {
        Contact c1 = new Contact();
        c1.setFirstName("TAneKAnz");
        c1.setLastName("kanphairor");
        c1.setPhoneNumber("09-3742-5415");
        System.out.println(c1);
        System.out.println(c1.formatPhoneNumber());
    }
}
