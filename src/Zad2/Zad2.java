package Zad2;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class Zad2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        File fileZad2 = new File("test.txt");

        if (!fileZad2.exists()){
            try {
                fileZad2.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        String stringList = scanner.nextLine()+ "\n";

        /*
        try {
            Files.write(fileZad2.toPath(), stringList.getBytes(), StandardOpenOption.TRUNCATE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }
*/

        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(fileZad2, true); ////(fileZad2, true) if chcemy nadpisywać
            fileOutputStream.write(stringList.getBytes());

            fileOutputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
