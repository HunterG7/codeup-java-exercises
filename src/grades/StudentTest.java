package grades;

import java.util.ArrayList;
import java.util.HashMap;

public class StudentTest {
    public static void main(String[] args) {
        ArrayList<Integer> grades = new ArrayList<>();
        HashMap<String, String> attendance = new HashMap<>();
        Students studentGrades = new Students("Student Grades", grades, attendance);

        studentGrades.addGrade(98);
        studentGrades.addGrade(76);
        studentGrades.addGrade(88);
        studentGrades.addGrade(80);

        for (int grade : studentGrades.getGrades()){
            System.out.println(grade);
        }
        System.out.println(studentGrades.getGradeAverage());

        HashMap<String, String> attendanceTest = new HashMap<>();
        attendanceTest.put("1", "P");
        attendanceTest.put("2", "P");
        attendanceTest.put("3", "A");

        System.out.println(attendanceTest);



    }
}
