public class DiceApp {
    public static void main(String[] args) {
        Dice d = new Dice();
        for (int i = 0; i < 10000; i++) {
            System.out.println(d.roll());
        }
        d.showFreq();
    }
}
