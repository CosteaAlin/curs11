package ro.fasttrackit.homework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Classroom {

    private List<StudentGrade> studentGradesList;

    public Classroom(List<StudentGrade> studentGrades) {
        if (studentGrades.size() > 0) {
            this.studentGradesList = new ArrayList<>(studentGrades);
        } else {
            throw new IllegalArgumentException("You can not create a classroom with 0 students");
        }
    }

    public List<Integer> getGradesForDiscipline(String discipline) {
        List<Integer> result = new ArrayList<>();
        if (discipline == null) {
            for (StudentGrade studentGrade : studentGradesList) {
                result.add(studentGrade.getGrade());
            }
        } else {
            for (StudentGrade studentGrade : studentGradesList) {
                if (discipline.equalsIgnoreCase(studentGrade.getDiscipline())) {
                    result.add(studentGrade.getGrade());
                }
            }
        }
        return result;
    }

    public List<Integer> getGradesForStudent(String name) {
        if (name == null) {
            throw new NullPointerException();
        } else {
            List<Integer> result = new ArrayList<>();
            for (StudentGrade studentGrade : studentGradesList) {
                if (name.equalsIgnoreCase(studentGrade.getName())) {
                    result.add(studentGrade.getGrade());
                }
            }
            return result;
        }
    }

    public StudentGrade getMaxGrade(String discipline) {
        if (discipline == null) {
            int maxGrade = 0;
            StudentGrade result = null;
            for (StudentGrade studentGrade : studentGradesList) {
                if (studentGrade.getGrade() > maxGrade) {
                    maxGrade = studentGrade.getGrade();
                    result = studentGrade;
                }
            }
            return result;
        } else {
            List<Integer> grades = getGradesForDiscipline(discipline);
            int maxGrade = Collections.max(grades);
            for (StudentGrade studentGrade : studentGradesList) {
                if (studentGrade.getGrade() == maxGrade && discipline.equalsIgnoreCase(studentGrade.getDiscipline())) {
                    return studentGrade;
                }
            }
        }
        return null;
    }

    public StudentGrade getMaxGrade() {
        return this.getMaxGrade(null);
    }

    public int getAverageGrade(String discipline) {
        List<Integer> grades = this.getGradesForDiscipline(discipline);
        if (grades.size() == 0) {
            return -1;
        }
        int sum = 0;
        for (Integer grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }

    public StudentGrade getWorstGrade(String discipline) {
        List<Integer> grades = this.getGradesForDiscipline(discipline);
        int worstGrade = Collections.min(grades);
        if (discipline == null) {
            for (StudentGrade studentGrade : studentGradesList) {
                if (studentGrade.getGrade() == worstGrade) {
                    return studentGrade;
                }
            }
        }
        for (StudentGrade studentGrade : studentGradesList) {
            if (studentGrade.getGrade() == worstGrade && discipline.equalsIgnoreCase(studentGrade.getDiscipline())) {
                return studentGrade;
            }
        }
        return null;
    }
}

