package grades;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {
    public static Scanner sc = new Scanner(System.in);

    public static void userOptions(HashMap<String, Students> students){
        System.out.println("Please choose an option:");
        System.out.println("""
                0 - exit
                1 - view all github usernames
                2 - view all students' grades
                3 - view full report on one student
                4 - view full report on all students
                5 - add new attendance date for all students
                """);
        String choiceStr = sc.nextLine();
        int choice = Integer.parseInt(choiceStr);
        choice(choice, students);
    }

    public static void choice (int choice, HashMap<String, Students> students){
        switch (choice){
            case 0 -> System.out.println("Goodbye, and have a wonderful day!");
            case 1 -> displayUsernames(students);
            case 2 -> studentsGradeReport(students);
            case 3 -> confirmKey(students);
            case 4 -> fullReport(students);
            case 5 -> addAttendance(students);
            default -> {
                System.out.println("That is not a valid option.");
                userOptions(students);
            }
        }
    }

    public static void addAttendance(HashMap<String, Students> students){
        System.out.println("Which attendance date would you like to add for the students? [YYYY-MM-DD]");
        String newDate = sc.nextLine();
        students.forEach((key, value)->{
            System.out.printf("Did %s attend class on %s? [y/N]%n", value.getName(), newDate);
            String choice = sc.nextLine();
            if (choice.equalsIgnoreCase("y")){
                value.recordAttendance(newDate, "P");
            } else {
                value.recordAttendance(newDate, "A");
            }
        });

        System.out.println("The Students attendance has been updated.");
        System.out.println();

        userOptions(students);
    }

    public static void studentsGradeReport(HashMap<String, Students> students){
        System.out.println("Here are all the students' grades.");
        students.forEach((key, value)-> System.out.printf("%s's Grades: %s%n", value.getName(), value.getGrades()));
        System.out.println();
        userOptions(students);
    }

    public static void fullReport(HashMap<String, Students> students){
        System.out.println("Here is all the information on the students.");
        System.out.println("Name | Github Username | Grades | Grade Average | Attendance | Days Absent | Attendance Percentage");
        System.out.println("--------------------------------------------------------------------------------------------------");
        students.forEach((key, value)-> System.out.printf("%s | %s | %s | %.2f%% | %s | %s | %.2f%%%n",
                value.getName(), key, value.getGrades(), value.getGradeAverage(), value.getAttendance(), value.daysAbsent(), value.attendancePercentage()));
        System.out.println();
        userOptions(students);
    }

    public static void confirmKey (HashMap<String, Students> students){
        System.out.println("\nWhat student would you like to see more information on?");
        String userInput = sc.nextLine();
        System.out.printf("> %s%n", userInput);
        if (!students.containsKey(userInput)) {
            System.out.printf("Sorry, no student found with the GitHub username of \"%s\".%n%n", userInput);
            System.out.println("Would you like to see another student? [y/N]");
            String choice = sc.nextLine();
            if (choice.equalsIgnoreCase("y")){
                confirmKey(students);
            }
        } else {
            singleReport(students, userInput);
        }
    }

    public static void singleReport (HashMap<String, Students> students ,String userInput){
        System.out.printf("Name: %s%n", students.get(userInput).getName());
        System.out.printf("Github Username: %s%n", userInput);
        System.out.printf("All Grades: %s%n", students.get(userInput).getGrades());
        System.out.printf("Grade Average: %.2f%n", students.get(userInput).getGradeAverage());
        System.out.printf("Attendance: %s%n", students.get(userInput).getAttendance());
        System.out.printf("Days Absent: %s%n", students.get(userInput).daysAbsent());
        System.out.printf("Attendance Percentage: %.2f%%%n%n", students.get(userInput).attendancePercentage());

        System.out.println("Would you like to see another student? [y/N]");
        String choice = sc.nextLine();
        if (choice.equalsIgnoreCase("y")){
            confirmKey(students);
        } else {
            userOptions(students);
        }
    }

    public static void displayUsernames (HashMap<String, Students> students){
        System.out.println("Here are the GitHub usernames of our students:");
        for (String username : students.keySet()){
            System.out.printf("|%s| ", username);
        }
        System.out.println("\n");
        userOptions(students);
    }

    public static void main(String[] args) {
        HashMap<String, Students> students = new HashMap<>();

        ArrayList<Integer> s1Grades = new ArrayList<>(Arrays.asList(98, 100, 91));
        HashMap<String, String> s1Attendance = new HashMap<>();
        s1Attendance.put("2017-10-01", "P");
        s1Attendance.put("2017-10-02", "A");
        s1Attendance.put("2017-10-03", "P");
        Students student1 = new Students("Hunter", s1Grades, s1Attendance);

        ArrayList<Integer> s2Grades = new ArrayList<>(Arrays.asList(81, 77, 85));
        HashMap<String, String> s2Attendance = new HashMap<>();
        s2Attendance.put("2017-10-01", "P");
        s2Attendance.put("2017-10-02", "P");
        s2Attendance.put("2017-10-03", "P");
        Students student2 = new Students("James", s2Grades, s2Attendance);

        ArrayList<Integer> s3Grades = new ArrayList<>(Arrays.asList(99, 90, 85));
        HashMap<String, String> s3Attendance = new HashMap<>();
        s3Attendance.put("2017-10-01", "A");
        s3Attendance.put("2017-10-02", "A");
        s3Attendance.put("2017-10-03", "P");
        Students student3 = new Students("Martha", s3Grades, s3Attendance);

        ArrayList<Integer> s4Grades = new ArrayList<>(Arrays.asList(77, 64, 79));
        HashMap<String, String> s4Attendance = new HashMap<>();
        s4Attendance.put("2017-10-01", "P");
        s4Attendance.put("2017-10-02", "P");
        s4Attendance.put("2017-10-03", "A");
        Students student4 = new Students("Ice Spice", s4Grades, s4Attendance);

        students.put("Hunter124", student1);
        students.put("j.dillard5", student2);
        students.put("PurplePanther", student3);
        students.put("orange_soda7", student4);

        System.out.println("Welcome\n");
        userOptions(students);
    }
}
