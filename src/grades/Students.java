package grades;

import java.util.ArrayList;
import java.util.HashMap;

public class Students {
    private String name;
    private ArrayList<Integer> grades;
    private HashMap<String, String> attendance;

    // constructor
    public Students() {}
    public Students(String name, ArrayList<Integer> grades, HashMap<String, String> attendance) {
        this.name = name;
        this.grades = grades;
        this.attendance = attendance;
    }

    // getters and setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public ArrayList<Integer> getGrades() {
        return grades;
    }
    public void setGrades(ArrayList<Integer> grades) {
        this.grades = grades;
    }
    public HashMap<String, String> getAttendance() {
        return attendance;
    }
    public void setAttendance(HashMap<String, String> attendance) {
        this.attendance = attendance;
    }

    // methods
    public void addGrade(int grade){
        grades.add(grade);
    }
    public double getGradeAverage(){
        int total = 0;
        for (int grade : grades){
            total += grade;
        }
        return (double) total / grades.size();
    }
    public void recordAttendance(String date, String value){
        if (value.equals("A") || value.equals("P")){
            attendance.put(date, value);
        } else {
            System.out.println("Value must be 'A' or 'P'!");
        }
    }
    public double attendancePercentage(){
        int total = attendance.size();
        int absences = 0;
        for(String value : attendance.values()){
            if(value.equals("A")){
                absences++;
            }
        }
        return ((double)(total - absences) / total) * 100;
    }
    public ArrayList<String> daysAbsent (){
        ArrayList<String> daysAbsent = new ArrayList<>();
        attendance.forEach((key, value)->{
            if (value.equals("A")){
                daysAbsent.add(key);
            }
        });
        return daysAbsent;
    }

}
