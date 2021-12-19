package ro.fasttrackit.homework;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Engine {

    public static List getStudentGrades(String path) throws Exception {
        List<StudentGrade> answer = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = reader.readLine()) != null) {
                answer.add(readStudentGrades(line));
            }
        }
        return answer;
    }

    private static StudentGrade readStudentGrades(String line) {
        String[] tokens = line.split("[|]");
        return new StudentGrade(tokens[0], tokens[1], Integer.parseInt(tokens[2]));
    }
}
