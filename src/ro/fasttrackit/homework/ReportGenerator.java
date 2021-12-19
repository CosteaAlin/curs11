package ro.fasttrackit.homework;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class ReportGenerator {
    Classroom classroom;

    public ReportGenerator(Classroom classroom){
        this.classroom=classroom;
    }

    public void generateReport() throws Exception {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("files/grade-reports.out"))) {
            StudentGrade highestGrade = this.classroom.getMaxGrade();
            StudentGrade worstGrade = this.classroom.getWorstGrade(null);
            writer.write("Highest note: " + highestGrade.getName() + " - " + highestGrade.getGrade());
            writer.newLine();
            writer.write("Average grade: " + this.classroom.getAverageGrade(null));
            writer.newLine();
            writer.write("Worst grade: " + worstGrade.getName() + " - " + worstGrade.getGrade());
        } catch (Exception e){
            System.out.println("Something went wrong.");
        }
    }
}
