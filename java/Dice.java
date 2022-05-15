package java;
import java.util.Random;

public class Dice {
    private int[] freq = new int[6];

    public int[] getFreq() {
        return freq;
    }

    public static Random r = new Random();
    public int roll() {
        int face = r.nextInt(6) + 1;
        freq[face-1]++; 
        return face;
    }
    public void showFreq() {
        for (int i = 0; i < 6; i++) {
            System.out.printf("face %d = %d time\n", i, freq[i]);
        }
    }
}
