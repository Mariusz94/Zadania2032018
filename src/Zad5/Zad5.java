package Zad5;

import java.io.*;
import java.util.Scanner;

public class Zad5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj z jakiego pliku będziemyy zamieniać słowa pomiętaj o rozszerzeniu");
        String fileName = scanner.nextLine();

        File file = new File(fileName);

        StringBuilder readText = new StringBuilder();
        FileInputStream fileInputStream = null;

        try {
            fileInputStream = new FileInputStream(file);
            int read;
            while((read = fileInputStream.read())  != -1){
                readText.append((char)read);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        String readTextString = readText.toString();

        System.out.println("Wpowadź wyraz który chesz podstawić");
        String wordToChange = scanner.nextLine();

        if (readTextString.contains(wordToChange)){
            System.out.println("Na jakie słowo byś chciał zmienić");
            String newWord = scanner.nextLine();

            readTextString = readTextString.replace(wordToChange,newWord);
        }

        FileOutputStream fileOutputStream = null;

        try {
            fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(readTextString.getBytes());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
