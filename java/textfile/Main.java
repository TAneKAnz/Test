package java.textfile;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        demoFileWriter();
        //demoFileReader();

    }

    public static void demoFileWriter() {
        System.out.println(System.getProperty("user.home"));
        File f = new File(System.getProperty("user.home"), "output3.txt");
        System.out.println(f.getAbsoluteFile());
        if (f.exists()) {
            System.out.println("this file is already!!");
        }
        try {
            FileWriter w = new FileWriter(f);
            w.write(unicodeTable('a', 'z'));
            w.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }

    public static void demoFileReader() {
        try {
            FileReader r = new FileReader("c:\\Users\\tanin\\Test\\textfile\\output.txt");
            int data;
            while ((data = r.read()) != -1) {
                System.out.printf("%c", data);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }

    public static String unicodeTable(int fromCode, int toCode) {
        StringBuilder sb = new StringBuilder();
        //to separate line for every os
        String ls = System.getProperty("line.separator");
        for (int i = fromCode; i <= toCode; i++) {
            sb.append(String.format("X%04X: %-4d: %c", i, i, i));
            sb.append(ls);
        }
        return sb.toString();
    }
}
