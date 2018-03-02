package Zad4;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Zad4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź jaki chcesz stwrzyć plik z rozszerzeniem");
        String fileName = scanner.nextLine();
        File file = new File(fileName);

        if(!(file.exists() == true)){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
