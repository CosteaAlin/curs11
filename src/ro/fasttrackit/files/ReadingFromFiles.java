package ro.fasttrackit.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ReadingFromFiles {
    public static void main(String[] args) throws Exception {
        readOneLine();
        readfullFile();
        readFileBufferd();
    }

    private static void readFileBufferd() throws Exception {
        System.out.println("Buffered read: ");
        BufferedReader fileReader = new BufferedReader(new FileReader("files/content.txt"));
        String line;
        while ((line = fileReader.readLine()) != null) {
            System.out.println(line);
        }

    }

    private static void readfullFile() throws FileNotFoundException {
        System.out.println("-----All file: ");
        Scanner fileScanner = new Scanner(new File("files/content.txt"));
        while (fileScanner.hasNext()) {
            System.out.println(fileScanner.nextLine());
        }
    }

    private static void readOneLine() throws FileNotFoundException {
        Scanner fileScanner = new Scanner(new File("files/content.txt"));
        String line = fileScanner.nextLine();
        System.out.println(line);
    }
}
