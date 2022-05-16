package java.card;


import java.lang.reflect.Member;

public class Main {
    public static void main(String[] args) {
        //demoCard();
        //demoPolymorphism();
        demoReceipt();
    }

    public static void receipt(MemberCard m, float amount) {
        System.out.println(m.getClass().getName());
        System.out.printf("amount     = %10.2f\n", amount);
        System.out.printf("discount   = %10.2f\n", amount * m.discount(amount));
        System.out.printf("net        = %10.2f\n", amount - (amount * m.discount(amount)));
    }

    public static void demoReceipt() {
        MemberCard m1 = new SilverCard();
        receipt(m1, 1000f);

        MemberCard m2 = new DaimondCard();
        receipt(m2, 1000f);
    }

    public static void demoCard() {
        PlatinumCard p1 = new PlatinumCard();
        System.out.println("Platinum: " + p1.discount(1000f));
        System.out.println("receive point " + p1.calcPoint(1000f));

        GoldCard c1 = new GoldCard();
        System.out.println("Gold: " + c1.discount(2000f));

        SilverCard s1 = new SilverCard();
        System.out.println("Silver: " + s1.discount(3000f));
    }

    public static void demoPolymorphism() {
        MemberCard p1 = new PlatinumCard();
        System.out.println("Platinum: " + p1.discount(1000f));
        System.out.println("receive point " + p1.calcPoint(1000f));

        MemberCard c1 = new GoldCard();
        System.out.println("Gold: " + c1.discount(2000f));

        MemberCard s1 = new SilverCard();
        System.out.println("Silver: " + s1.discount(3000f));

        MemberCard d1  = new DaimondCard();
        System.out.println("Daimond: " + d1.discount(4000f));
    }
}
