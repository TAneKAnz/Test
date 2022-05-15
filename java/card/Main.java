package java.card;
public class Main {
    public static void main(String[] args) {
        demoCard();
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
}
