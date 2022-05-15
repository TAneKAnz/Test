package java;
public class Strings {
    public static void main(String[] args) {
        String s1 = "Rain";
        String s2 = "Bow";
        String s3 = s1 + s2;
        System.out.println(s3);
        System.out.println(s3.length());
        System.out.println(s3.substring(0, 4));
        System.out.println(stringWithPos(s3));

    }
    public static String stringWithPos(String s) {
        String pos = "";
        for (int i = 0; i < s.length(); i++) {
            pos += (i % 10);
        }
        return String.format("%s\n%s", pos, s);
    }
}
