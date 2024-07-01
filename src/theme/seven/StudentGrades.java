package theme.seven;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

// Задание 1
public class StudentGrades {
    private HashMap<String, List<Integer>> studentGrades;

    public StudentGrades() {
        this.studentGrades = new HashMap<>();
    }

    public void addStudent(String studentName) {
        studentGrades.put(studentName, new ArrayList<>());
        System.out.println("Студент " + studentName + " добавлен");
    }

    public void addGrade(String studentName, int grade) {
        List<Integer> grades = studentGrades.get(studentName);
        if (grades != null) {
            grades.add(grade);
            System.out.println("Оценка " + grade + " добавлена для студента " + studentName);
        } else {
            System.out.println("Студент " + studentName + " не найден");
        }
    }

    public double getAverageGrade(String studentName) {
        List<Integer> grades = studentGrades.get(studentName);
        if (grades == null || grades.isEmpty()) {
            System.out.println("Оценки для студента " + studentName + " не найдены");
            return 0;
        }
        double sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }

    public static void main(String[] args) {
        StudentGrades studentGrades = new StudentGrades();
        studentGrades.addStudent("Alice");
        studentGrades.addGrade("Alice", 85);
        studentGrades.addGrade("Alice", 90);

        studentGrades.addStudent("Bob");
        studentGrades.addGrade("Bob", 75);
        studentGrades.addGrade("Bob", 80);

        System.out.println("Средний балл студента Alice: " + studentGrades.getAverageGrade("Alice"));
        System.out.println("Средний балл студента Bob: " + studentGrades.getAverageGrade("Bob"));
        System.out.println("Средний балл студента Charlie: " + studentGrades.getAverageGrade("Charlie")); // Оценки не найдены
    }
}
