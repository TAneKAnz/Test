public class AppBox {
    public static void main(String[] args) {
        Box aBox = new Box();
        Box bBox = new Box(1, 2, 3);
        aBox.setW(1);
        aBox.setH(2);
        aBox.setD(3);

        System.out.println(aBox.volume());
        System.out.println(bBox.volume());

        if (aBox.getW() < 5) {
            System.out.println("Too small!!");
        }

        System.out.println(aBox);
        System.out.println(aBox.toString());
    }
}
