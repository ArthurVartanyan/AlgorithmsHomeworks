package theme.three;

import java.util.LinkedList;

public class SelectionSort {
    public static void main(String[] args) {
        // Задание 3
        Student[] students = new Student[9];
        students[0] = new Student(5, "Сергей Иванов Валерьевич");
        students[1] = new Student(2, "Иван Мельниченко Васильевич");
        students[2] = new Student(4, "Мария Иванова Олеговна");
        students[3] = new Student(4, "Наталья Чупандина Владимировна");
        students[4] = new Student(3, "Алексей Баев Алексеевич");
        students[5] = new Student(3, "Дарья Воева Николаевна");
        students[6] = new Student(2, "Сергей Раенко Дмитриевич");
        students[7] = new Student(5, "Артем Матвеев Даниилович");
        students[8] = new Student(4, "Евгений Белый Георгиевич");

        System.out.println(selectionSortByAsc(students));
    }

    static class Student {

        int point;

        String fullName;

        public Student(int point, String fullName) {
            this.point = point;
            this.fullName = fullName;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "point=" + point +
                    ", fullName='" + fullName + '\'' +
                    '}';
        }

        public int getPoint() {
            return point;
        }
    }

    static LinkedList<Student> selectionSortByAsc(Student[] students) {
        LinkedList<Student> sortedList = new LinkedList<>();
        for (int i = 0; i < students.length; i++) {
            int studentWithMinPoint = i;
            for (int j = i + 1; j < students.length; j++) {
                if (students[studentWithMinPoint].getPoint() > students[j].getPoint()) {
                    studentWithMinPoint = j;
                }
            }
            sortedList.add(students[studentWithMinPoint]);

            if (studentWithMinPoint != i) {
                Student temp = students[i];
                students[i] = students[studentWithMinPoint];
                students[studentWithMinPoint] = temp;
            }
        }
        return sortedList;
    }
}
