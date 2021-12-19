package ro.fasttrackit.files;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class WritingToFile {
    public static void main(String[] args) throws Exception {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("files/output.txt"))){
            writer.write("Test Test");
            writer.write("Test Test");
            writer.write("Test Test");
        }
    }
}
