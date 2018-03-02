package Zad1;

import java.io.File;

public class Zad1 {
    public static void main(String[] args) {
        File file = new File("test.txt");
        File file1 = new File("akademia.kodu");
        File file2 = new File("pasta.mojeRoz");

        System.out.println(file.exists());
        System.out.println(file1.exists());
        System.out.println(file2.exists());

    }
}
