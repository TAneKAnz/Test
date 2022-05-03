package textfile;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        demoFileReader();
    }

    public static void demoFileWriter() {
        try {
            FileWriter w = new FileWriter("c:\\Users\\tanin\\Test\\textfile\\output.txt");
            w.write("hello");
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
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }
}
