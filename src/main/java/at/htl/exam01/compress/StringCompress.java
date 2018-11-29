package at.htl.exam01.compress;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class StringCompress {

    private static final String FILE_NAME = "sample.txt";

    public static void main(String[] args) {
        StringCompress sc = new StringCompress();
        String[] text = sc.readFromFile(FILE_NAME);
        sc.print(text);
    }

    public String[] readFromFile(String fileName) {

        String[] zeilen = new String[getNoOfLines(fileName)];
        int counter = 0;

        try (Scanner scanner = new Scanner(new FileReader(fileName))) {
            while (scanner.hasNextLine()) {
                zeilen[counter] = scanner.nextLine();
                counter++;
            }
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        }

        char buchstabe;
        int zahl;
        String text;
        StringBuilder sb;

        for (int i = 0; i < zeilen.length; i++) {

            sb = new StringBuilder();
            buchstabe = zeilen[i].charAt(0);
            zahl = Integer.valueOf(zeilen[i].substring(1));

            for (int j = 0; j < zahl; j++) {
                sb.append(buchstabe);
            }

            zeilen[i] = sb.toString();

        }

        return zeilen;

    }

    public void print(String[] lines) {
        for (int i = 0; i < lines.length; i++) {
            System.out.println(lines[i]);
        }
    }

    public int getNoOfLines(String fileName) {

        int counter = 0;

        try (Scanner scanner = new Scanner(new FileReader(fileName))) {
            while(scanner.hasNextLine()) {
                scanner.nextLine();
                counter++;
            }
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        }
        return counter;
    }
}
