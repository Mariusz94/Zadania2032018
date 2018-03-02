package Zad3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Zad3 {
    public static void main(String[] args) {
        File file = new File("test.txt");

        StringBuilder stringBuilder = new StringBuilder();

        FileInputStream fileInputStream = null;

        try {
            fileInputStream = new FileInputStream(file);
            int read;
            while ((read = fileInputStream.read()) != -1) {
                stringBuilder.append((char) read);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        System.out.println(stringBuilder);
    }
}
