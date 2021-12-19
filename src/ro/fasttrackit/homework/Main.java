package ro.fasttrackit.homework;

import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        List<StudentGrade> studentGradesList= Engine.getStudentGrades("files/grades.txt");

        Classroom classroom = new Classroom(studentGradesList);
        System.out.println(classroom.getGradesForDiscipline("Computer Science"));
        System.out.println(classroom.getGradesForStudent("Ealhstan Saira"));
        System.out.println(classroom.getMaxGrade());
        System.out.println(classroom.getMaxGrade("Physics"));
        System.out.println(classroom.getAverageGrade(null));
        System.out.println(classroom.getAverageGrade("Computer Science"));
        System.out.println(classroom.getWorstGrade("Computer Science"));
        System.out.println(classroom.getWorstGrade(null));

        ReportGenerator reportGenerator = new ReportGenerator(classroom);
        reportGenerator.generateReport();
    }
}
